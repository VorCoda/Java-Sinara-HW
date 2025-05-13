package com.example.Sinara.Service;

public class BuyChocolateDTO {
    private ChocolateType type;
    private int count;


    public BuyChocolateDTO(ChocolateType type, Integer count){
        this.type = type;
        this.count = count;
    }
    public ChocolateType getType() {
        return type;
    }

    public void setType(ChocolateType type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
