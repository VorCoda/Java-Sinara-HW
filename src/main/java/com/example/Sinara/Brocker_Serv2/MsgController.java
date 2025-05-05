package com.example.Sinara.Brocker_Serv2;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/send-to-service1")
    public Status sendMessage(@RequestBody MsgDTO message) {
        rabbitTemplate.convertAndSend("queue1", message);
        return new Status("sent to serv1");
    }
}
