package com.example.Sinara.Events_and_Listeners;


import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//Например, отправляет имя книги для обновления каталога библиотеки
@Component
public class CatalogUpdate {

    @EventListener
    public void handleBookDeliveryEvent(BookDeliveryEvent event){
        System.out.println("Обычный EventListener: обработано событие поставки книги:");
        System.out.println("Обновите каталог, добавлена книга: " + event.getBookTitle());
    }
}
