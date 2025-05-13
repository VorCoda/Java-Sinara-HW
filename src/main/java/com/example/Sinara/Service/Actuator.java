package com.example.Sinara.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Endpoint(id = "actuator")
public class Actuator {
    private final Logger logger = LoggerFactory.getLogger(Actuator.class);

    @ReadOperation
    public String invoke() {
        String message = "Custom actuator invoked at " + LocalDateTime.now();
        logger.info(message);
        return message;
    }
}
