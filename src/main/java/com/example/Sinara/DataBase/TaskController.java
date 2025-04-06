package com.example.Sinara.DataBase;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskListRepository taskListRepository;

    public TaskController(TaskListRepository taskListRepository){
        this.taskListRepository = taskListRepository;
    }

    //Обработка POST запроса
    @PostMapping
    public ResponseEntity<String> createTaskList(@RequestBody TaskListDTO  taskListDTO){ //сразу преобразуем JSON в объекты TaskListDTO
        TaskList taskList = new TaskList();
        taskList.setName(taskListDTO.getName());
        taskList.setEvents(taskListDTO.getEvents());
        taskListRepository.save(taskList);

        return ResponseEntity.ok("TaskList is created");
    }

    //Обработка GET запроса
    @GetMapping
    public ResponseEntity<List<TaskListDTO>> getAllTasks(){
        List<TaskList> taskLists = taskListRepository.findAll();
        List<TaskListDTO> taskListDTOs = taskLists.stream()
                .map(this::convertToDTO)
                .toList();
        return ResponseEntity.ok(taskListDTOs);
    }

    //Метод для перевода листа сущностей TaskList в лист отображения для пользователей
    private TaskListDTO convertToDTO(TaskList taskList) {
        TaskListDTO dto = new TaskListDTO();
        dto.setName(taskList.getName());
        dto.setEvents(taskList.getEvents());
        return dto;
    }
}
