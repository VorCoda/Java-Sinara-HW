package com.example.Sinara.Service;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Регистрируем интерсептор
@Configuration
public class WebConfig implements WebMvcConfigurer {

    private final RequestMetricsInterceptor interceptor;

    public WebConfig(RequestMetricsInterceptor interceptor) {
        this.interceptor = interceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor);
    }
}
