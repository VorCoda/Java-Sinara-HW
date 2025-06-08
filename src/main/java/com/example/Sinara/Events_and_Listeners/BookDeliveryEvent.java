package com.example.Sinara.Events_and_Listeners;

import org.springframework.context.ApplicationEvent;

//Событие для сервиса доставки книг
public class BookDeliveryEvent extends ApplicationEvent {


    private final String bookTitle;      // Название книги
    private final int editionNumber;     // Номер издания
    private final int count;


    public BookDeliveryEvent(Object source, String bookTitle, int editionNumber, int count) {
        super(source); // Источник события
        this.bookTitle = bookTitle;
        this.editionNumber = editionNumber;
        this.count = count;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public int getEditionNumber() {
        return editionNumber;
    }

    public int getBookCount(){
        return count;
    }
}
