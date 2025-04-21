package com.example.Sinara;

import com.example.Sinara.Events_and_Listeners.BookDeliveryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class JavaSinaraApplication implements CommandLineRunner {

	private final BookDeliveryService bookDeliveryService;

	public JavaSinaraApplication(BookDeliveryService bookDeliveryService){
		this.bookDeliveryService = bookDeliveryService;
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaSinaraApplication.class, args);
	}

	public void run(String... args) throws Exception {

		// 1. Публикация обычного события
		bookDeliveryService.publishNormalEvent  ("Война и мир", 3345353, 3);

		// 2. Публикация асинхронного события
		bookDeliveryService.publishAsyncEvent ("1984", 577768, 7);

		// 3. Публикация транзакционного события (успешная транзакция)
		try {
			bookDeliveryService.publishTransactionalEvent ("Мастер и Маргарита", 2, 10);
		} catch (Exception e) {
			System.out.println("Ошибка: " + e.getMessage());
		}

		// 4. Публикация транзакционного события (откат транзакции)
		try {
			bookDeliveryService.publishTransactionalEvent ("Портрет", 0, 21);
		} catch (Exception e) {
			System.out.println("Ошибка: " + e.getMessage());
		}


	}

}
