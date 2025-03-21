package com.example.Sinara.Validation;

//Класс для проверки аннотации, содержащей другие аннотации
public class User2 {

    @ValidCard //применяем нашу 2-ю аннотацию
    private String cardNumber;

    public String getCardNumber(){
        return cardNumber;
    }

    public  void  setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
}
