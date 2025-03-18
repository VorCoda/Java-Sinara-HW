package com.example.Sinara.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

//Класс для обработки JSON, возвращает тоже сразу json
@RestController
public class JsonController {

    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/processJson")
    public Map<String, Object> processJson(@RequestBody Map<String, Object> payload){
        Map<String,Object> info = (Map<String, Object>) payload.get("info");
        info.put("id", counter.incrementAndGet());

        return payload;
    }
}
