package com.example.Sinara.Validation;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
//Класс для тестирования аннотации с валидатором
public class User {

    @NotNull(message = "Name can't be null")
    @NotEmpty(message = "Name can't be empty")
    private String name;

    @CardNumber // Это проверит кастомная аннотация
    private String cardNumber;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
