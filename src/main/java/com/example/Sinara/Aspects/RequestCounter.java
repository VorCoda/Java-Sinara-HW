package com.example.Sinara.Aspects;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

//Считает кол-во обращений к апи методам
@Component
public class RequestCounter {
    //Через мап будет удобно хранить в виде Метод - кол-во вызовов (ключ-значение)
    private final Map<String, Integer> counter = new HashMap<>();

    //Метод, который реализует подсчет кол-ва вызовов апи метода
    public void increment(String methodName) {
        counter.put(methodName, counter.getOrDefault(methodName, 0) + 1);
    }

    //Метод, который выводит кол-во вызовов того или иного апи метода
    public int getCount(String methodName) {
        return counter.getOrDefault(methodName, 0);
    }
}
