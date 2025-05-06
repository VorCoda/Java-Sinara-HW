package com.example.Sinara.DataBase;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

//Создадим сущность для БД
@Entity
public class TaskList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String name;

    @ElementCollection
    @CollectionTable(name = "task_events")
    private Set<String> events;


    // Переопределение equals и hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskList taskList = (TaskList) obj;
        return Objects.equals(id, taskList.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

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
