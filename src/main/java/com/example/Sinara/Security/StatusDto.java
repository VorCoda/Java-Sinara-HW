package com.example.Sinara.Security;

public class StatusDto {
    private String status;

    public StatusDto(String status){
        this.status = status;
    }

    public String getStatus(){
        return  status;
    }

    public void setStatus(String status){
        this.status =status;
    }
}
