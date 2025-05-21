package com.example.Sinara.Service;

public class BuyStatusDto {
    private String status;
    private ChocolateType type;

    public BuyStatusDto(String status, ChocolateType type){
        this.status = status;
        this.type = type;
    }

    public ChocolateType getType() {
        return type;
    }

    public void setType(ChocolateType type) {
        this.type = type;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
