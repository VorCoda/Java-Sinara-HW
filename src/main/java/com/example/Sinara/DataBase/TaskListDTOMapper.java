package com.example.Sinara.DataBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskListDTOMapper {


    //Метод для перевода листа сущностей TaskList в лист отображения для пользователей
    public TaskListDTO convertToDTO(TaskList taskList) {
        TaskListDTO dto = new TaskListDTO();
        dto.setName(taskList.getName());
        dto.setEvents(taskList.getEvents());
        return dto;
    }

    // Метод для преобразования TaskListDTO в TaskList
    public TaskList convertFromDTO(TaskListDTO taskListDTO) {
        TaskList taskList = new TaskList();
        taskList.setName(taskListDTO.getName());
        taskList.setEvents(taskListDTO.getEvents());
        return taskList;
    }
}
