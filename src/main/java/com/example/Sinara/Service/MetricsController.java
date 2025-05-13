package com.example.Sinara.Service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;
//Выводит метрики
@RestController
@RequestMapping("/metrics")
public class MetricsController {

    private final MeterRegistry registry;

    public MetricsController(MeterRegistry registry) {
        this.registry = registry;
    }

    @GetMapping("/requests")
    public RequestMetricsDTO getRequestMetrics() {
        Counter counter = registry.get("custom.requests.count").counter();
        Timer timer = registry.get("custom.requests.latency").timer();

        RequestMetricsDTO dto = new RequestMetricsDTO();
        dto.setTotalRequests((long) counter.count());
        dto.setAverageTimeMs(timer.mean(TimeUnit.MILLISECONDS));
        return dto;
    }
}
