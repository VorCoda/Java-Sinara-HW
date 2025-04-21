package com.example.Sinara.Events_and_Listeners;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

//Например, отправляет на проверку номер издания
@Component
public class CheckOfferEditionNumb {

    @Async
    @EventListener
    public void handleBookDeliveryEvent(BookDeliveryEvent event){
        System.out.println("Асинхронный EventListener: обработано событие поставки книги:");
        System.out.println("Отправляем на проверку корректности издание: " + event.getEditionNumber());
    }
}
