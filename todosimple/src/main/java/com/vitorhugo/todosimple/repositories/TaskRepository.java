package com.vitorhugo.todosimple.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vitorhugo.todosimple.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUser_Id(Long userId);

    // @Query("SELECT t FROM Task t WHERE t.user.id = :id")
    // List<Task> findByUser_Id(@Param("id") Long id);
    
    // @Query(nativeQuery = true, value = "SELECT * FROM task t WHERE t.user_id = :id")
    // List<Task> findByUser_Id(@Param("id") Long id);
}
