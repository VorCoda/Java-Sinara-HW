package com.example.Sinara.DataBase;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private TaskListDTOMapper taskListDTOMapper;

    //Обработка POST запроса
    @PostMapping
    public Status createTaskList(@RequestBody TaskListDTO taskListDTO) {
        TaskList taskList = taskListDTOMapper.convertFromDTO(taskListDTO);
        taskService.createTaskList(taskList);
        return new Status("data processed");
    }

    //Обработка GET запроса
    @GetMapping
    public List<TaskListDTO> getAllTasks() {
        List<TaskList> taskLists = taskService.getAllTasks();
        List<TaskListDTO> dtos = taskLists.stream()
                .map(taskListDTOMapper::convertToDTO)
                .toList();
        return dtos;
    }


}
