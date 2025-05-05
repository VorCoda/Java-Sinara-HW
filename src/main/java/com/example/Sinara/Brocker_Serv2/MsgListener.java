package com.example.Sinara.Brocker_Serv2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MsgListener {

    private static final Logger logger = LoggerFactory.getLogger(MsgListener.class);

    @RabbitListener(queues = "queue2")
    public void receive(MsgDTO message) {
        logger.info("Service2 received: {}", message);
    }
}
