package com.example.Sinara.Validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CardNumberValidator implements ConstraintValidator<CardNumber, String> {

    //Проверят корректность номера
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        // Проверяем формат номера карты (только цифры и длина 16)
        return value.matches("\\d{16}");
    }
}
