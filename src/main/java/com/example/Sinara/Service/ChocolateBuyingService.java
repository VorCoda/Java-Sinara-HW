package com.example.Sinara.Service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
public class ChocolateBuyingService {
    private final Map<ChocolateType, AtomicInteger> chocolateCounters = new EnumMap<>(ChocolateType.class);

    public ChocolateBuyingService() {
        Arrays.stream(ChocolateType.values()).forEach(type -> chocolateCounters.put(type, new AtomicInteger(0)));
    }

    //Записываем тип шоколадки
    public void recordPurchase(ChocolateType type) {
        chocolateCounters.get(type).incrementAndGet();
    }

    //Записываем кол-во покупок шоколадки определенного типа
    public Map<ChocolateType, Integer> getPurchaseCounts() {
        return chocolateCounters.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().get()));
    }
}
