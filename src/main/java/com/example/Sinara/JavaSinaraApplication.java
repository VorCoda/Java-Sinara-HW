package com.example.Sinara;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSinaraApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSinaraApplication.class, args);

import com.example.Sinara.Validation.User;
import com.example.Sinara.Validation.User2;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class JavaSinaraApplication   {


	public static void main(String[] args) {
		SpringApplication.run(JavaSinaraApplication.class, args);

        //Тестирование кастомной аннотации с валидатором

        User user = new User();
        user.setName("Tom");
        user.setCardNumber("123456789012345"); // Неверный номер (меньше 16 цифр)
        //user.setCardNumber("1234567890123450"); // Верный номер

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<User>> violations = validator.validate(user);

        if (!violations.isEmpty()) {
            for (ConstraintViolation<User> violation : violations) {
                System.out.println(violation.getMessage()); // Выводит: "Invalid card number..."
            }
        } else {
            System.out.println("Validation passed!");
        }

        //Тестирование аннотации, объединяющей несколько других

//        User2 user = new User2();
//        user.setCardNumber("1234567890е123456"); // Неверный номер
//        //user.setCardNumber("2000567890123456"); // Верный номер
//        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//        Validator validator = factory.getValidator();
//
//        Set<ConstraintViolation<User2>> violations = validator.validate(user);
//
//        if (!violations.isEmpty()) {
//            for (ConstraintViolation<User2> violation : violations) {
//                System.out.println(violation.getMessage()); // Выводит соответствующие сообщения об ошибках
//            }
//        } else {
//            System.out.println("Validation passed!");
//        }


	}

}
