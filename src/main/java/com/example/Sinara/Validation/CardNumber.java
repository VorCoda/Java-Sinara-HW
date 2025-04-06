package com.example.Sinara.Validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Кастомная аннотация для проверки правильности введеного номера карты
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CardNumberValidator.class)
public @interface CardNumber {
    String message() default "Incorrect card number. Number must contain  16 digits"; //сообщение об ошибке
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}


