package com.example.Sinara;

import com.example.Sinara.Events_and_Listeners.BookDeliveryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class JavaSinaraApplication {

	private final BookDeliveryService bookDeliveryService;

	public JavaSinaraApplication(BookDeliveryService bookDeliveryService){
		this.bookDeliveryService = bookDeliveryService;
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaSinaraApplication.class, args);
	}



}
