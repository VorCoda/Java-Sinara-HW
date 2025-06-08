package com.example.Sinara.Events_and_Listeners;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//Например, отправляет имя книги для обновления каталога библиотеки
@Component
@Slf4j
public class CatalogUpdate {

    @EventListener
    public void handleBookDeliveryEvent(BookDeliveryEvent event){
        log.info("Обработано событие поставки книги" , event.getBookTitle(),
                event.getEditionNumber(),event.getBookCount());
    }
}
