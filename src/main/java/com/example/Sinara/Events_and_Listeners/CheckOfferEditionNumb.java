package com.example.Sinara.Events_and_Listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

//Например, отправляет на проверку номер издания
@Component
@Slf4j
public class CheckOfferEditionNumb {

    @Async
    @EventListener
    public void handleBookDeliveryEvent(BookDeliveryEvent event){
        log.info("Обработано событие поставки книги" , event.getBookTitle(),
                event.getEditionNumber(),event.getBookCount());
    }
}
