package com.example.Sinara.Validation;

//Аннотация, соединяющая несколько других

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {}) //Класс-валидатор не нужен
@Size(min = 16, max = 16, message = "Card number must be 16 digits.") //проверка на длину номера карты
@Pattern(regexp = "\\d+", message = "Card number must contain only digits.") //проверка на содержание
@Pattern(regexp = "^[2-5]\\d*", message = "Card number must start with 2, 4, or 5")//проверка на первую цифру номера карты
public @interface ValidCard {
    String message() default "Invalid card number."; //сообщение об ошибке
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
