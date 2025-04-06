package com.example.Sinara.DataBase;

import java.util.List;
//DataTransferObject
public class TaskListDTO {
    private String name;
    private List<String> events;

    public String getName(){
        return name;
    }

    public List<String> getEvents(){
        return events;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEvents(List<String> events){
        this.events = events;
    }
}
