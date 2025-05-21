package com.example.Sinara.Service;

public class BuyChocolateDTO {
    private ChocolateType type;
    private long count;


    public BuyChocolateDTO(ChocolateType type, Long count){
        this.type = type;
        this.count = count;
    }
    public ChocolateType getType() {
        return type;
    }

    public void setType(ChocolateType type) {
        this.type = type;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
