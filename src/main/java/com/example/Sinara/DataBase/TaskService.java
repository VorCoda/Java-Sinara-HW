package com.example.Sinara.DataBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskService {
    private final TaskListRepository taskListRepository;

    @Autowired
    public TaskService(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    // Метод для создания задач
    public TaskList createTaskList(TaskListDTO taskListDTO) {
        TaskList taskList = new TaskList();
        taskList.setName(taskListDTO.getName());
        taskList.setEvents(taskListDTO.getEvents());
        return taskListRepository.save(taskList);
    }

    // Метод для получения всех задач
    public List<TaskList> getAllTasks() {
        return taskListRepository.findAll();
    }
}
