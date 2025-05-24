package com.example.Sinara.Events_and_Listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookDeliveryController {

    @Autowired
    private BookDeliveryService bookDeliveryService;

    // Публикация обычного события
    @PostMapping("/normal")
    public StatusDto publishNormalEvent(@RequestBody BookDeliveryDto dto) {
        bookDeliveryService.publishNormalEvent(dto.getBookTitle(), dto.getEditionNumber(), dto.getCount());
        return new StatusDto("normal event");
    }

    // Публикация асинхронного события
    @PostMapping("/async")
    public StatusDto publishAsyncEvent(@RequestBody BookDeliveryDto dto) {
        bookDeliveryService.publishAsyncEvent(dto.getBookTitle(), dto.getEditionNumber(), dto.getCount());
        return new StatusDto("async event");
    }

    // Публикация транзакционного события
    // Транзакция будет отменена(rollback), если dto.EditionNumber будет <= 0
    @PostMapping("/transactional/success")
    public StatusDto publishSuccessfulTransactionalEvent(@RequestBody BookDeliveryDto dto) {
        bookDeliveryService.publishTransactionalEvent(dto.getBookTitle(), dto.getEditionNumber(), dto.getCount());
        return new StatusDto("transaction-ok");
    }



}
