package com.example.Sinara.Brocker_Serv2;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Service2 — отправляет в queue1, получает из queue2
@Configuration
public class RabbitConfig {
    @Bean
    public Queue queue1() {
        return new Queue("queue1"); // Отправляет в queue1
    }

    @Bean
    public Queue queue2() {
        return new Queue("queue2"); // Получает из queue2
    }
}
