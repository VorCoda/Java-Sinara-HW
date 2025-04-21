package com.example.Sinara.Events_and_Listeners;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationEventPublisher;


//Сервис доставки книг
@Service
public class BookDeliveryService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public BookDeliveryService(ApplicationEventPublisher eventPublisher) {
        this.applicationEventPublisher = eventPublisher;
    }

    // Метод для публикации события для обычного обработчика
    public void publishNormalEvent(String bookTitle, int editionNumber, int count) {
        System.out.println("Новая поставка: " + bookTitle);
        BookDeliveryEvent event = new BookDeliveryEvent(this, bookTitle, editionNumber, count);
        applicationEventPublisher.publishEvent(event);
    }

    // Метод для публикации события для асинхронного обработчика
    public void publishAsyncEvent(String bookTitle, int editionNumber, int count) {
        System.out.println("Новая поставка: " + bookTitle);
        BookDeliveryEvent event = new BookDeliveryEvent(this, bookTitle, editionNumber, count);
        applicationEventPublisher.publishEvent(event);
    }

    // Метод для публикации события для транзакционного обработчика
    @Transactional
    public void publishTransactionalEvent(String bookTitle, int editionNumber, int count) {
        System.out.println("Новая поставка: " + bookTitle);
        BookDeliveryEvent event = new BookDeliveryEvent(this, bookTitle, editionNumber, count);
        applicationEventPublisher.publishEvent(event);

        if (editionNumber <= 0) {
            throw new RuntimeException("Транзакция откатывается");
        }
    }
}
