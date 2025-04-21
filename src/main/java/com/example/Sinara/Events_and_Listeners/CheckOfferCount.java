package com.example.Sinara.Events_and_Listeners;

import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

//Например, отправляет на проверку кол-во книг в заказе
@Component
public class CheckOfferCount {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT) //когда транзакция завершена успешно
    public void handleBookDeliveryEvent(BookDeliveryEvent event){
        System.out.println("Транзакционный EventListener: обработано событие поставки книги:");
        System.out.println("Название книги: " + event.getBookTitle());
        System.out.println("Отправляем на проверку кол-во книг в заказе: " + event.getBookCount());
    }

}
