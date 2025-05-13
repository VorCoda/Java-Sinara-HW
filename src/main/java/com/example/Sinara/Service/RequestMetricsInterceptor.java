package com.example.Sinara.Service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.concurrent.TimeUnit;

//Интерсептор для сбора метрик
@Component
public class RequestMetricsInterceptor implements HandlerInterceptor {
    private final Counter requestCounter;
    private final Timer requestTimer;
    private final ThreadLocal<Long> requestStartTimes = new ThreadLocal<>();

    public RequestMetricsInterceptor(MeterRegistry registry) {
        this.requestCounter = registry.counter("custom.requests.count");
        this.requestTimer = registry.timer("custom.requests.latency");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        requestStartTimes.set(System.currentTimeMillis());
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        long duration = System.currentTimeMillis() - requestStartTimes.get();
        requestCounter.increment();
        requestTimer.record(duration, TimeUnit.MILLISECONDS);
        requestStartTimes.remove();
    }
}
