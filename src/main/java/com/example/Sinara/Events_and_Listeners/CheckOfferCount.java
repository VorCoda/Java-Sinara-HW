package com.example.Sinara.Events_and_Listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

//Например, отправляет на проверку кол-во книг в заказе
@Component
@Slf4j
public class CheckOfferCount {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT) //когда транзакция завершена успешно
    public void handleBookDeliveryEvent(BookDeliveryEvent event){
        log.info("Обработано событие поставки книги" , event.getBookTitle(),
                event.getEditionNumber(),event.getBookCount());
    }

}
