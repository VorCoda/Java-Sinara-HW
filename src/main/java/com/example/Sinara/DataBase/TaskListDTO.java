package com.example.Sinara.DataBase;

import java.util.List;
import java.util.Set;

//DataTransferObject
public class TaskListDTO {
    private String name;
    private List<String> events;

    public String getName(){
        return name;
    }

    public Set<String> getEvents(){
        return (Set<String>) events;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEvents(List<String> events){
        this.events = events;
    }
}
