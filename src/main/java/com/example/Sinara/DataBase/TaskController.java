package com.example.Sinara.DataBase;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")

public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    //Обработка POST запроса
    @PostMapping
    public Status createTaskList(@RequestBody TaskListDTO taskListDTO) {
        taskService.createTaskList(taskListDTO);
        return new Status("data processed");
    }

    //Обработка GET запроса
    @GetMapping
    public List<TaskListDTO> getAllTasks() {
        List<TaskList> taskLists = taskService.getAllTasks();
        List<TaskListDTO> dtos = taskLists.stream()
                .map(this::convertToDTO)
                .toList();
        return dtos;
    }

    //Метод для перевода листа сущностей TaskList в лист отображения для пользователей
    private TaskListDTO convertToDTO(TaskList taskList) {
        TaskListDTO dto = new TaskListDTO();
        dto.setName(taskList.getName());
        dto.setEvents(taskList.getEvents());
        return dto;
    }
}
