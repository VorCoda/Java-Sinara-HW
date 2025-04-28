package com.example.Sinara.Aspects;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {
    @Value("${api.max.requests}")
    private int maxRequests;

    public int getMaxRequests() {
        return maxRequests;
    }
}
