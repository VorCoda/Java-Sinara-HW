package com.example.Sinara.DataBase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskListRepository extends JpaRepository<TaskList, Long> {

}
