package com.example.Sinara.Service;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tags;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
public class ChocolateBuyingService {
    private final MeterRegistry registry;

    public ChocolateBuyingService(MeterRegistry registry) {
        this.registry = registry;
    }


    //Записываем сколько купили шоколадок определенного типа
    public void recordPurchase(ChocolateType type) {
         registry.counter("custom.requests.choco.count", Tags.of("type", type.name())).increment();
    }

}
