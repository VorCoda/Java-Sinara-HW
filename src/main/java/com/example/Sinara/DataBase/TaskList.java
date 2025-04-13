package com.example.Sinara.DataBase;

import jakarta.persistence.*;

import java.util.List;

//Создадим сущность для БД
@Entity
public class TaskList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String name;

    @ElementCollection
    private List<String> events;

    // Геттер для поля id
    public Long getId() {
        return id;
    }

    // Сеттер для поля id (обычно не нужен, так как id генерируется автоматически)
    public void setId(Long id) {
        this.id = id;
    }

    // Геттер для поля name
    public String getName() {
        return name;
    }

    // Сеттер для поля name
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для поля events
    public List<String> getEvents() {
        return events;
    }

    // Сеттер для поля events
    public void setEvents(List<String> events) {
        this.events = events;
    }

}
