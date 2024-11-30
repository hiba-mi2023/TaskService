package com.service1.task.service.repository;

import com.service1.task.service.modal.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {

    public List<Task> findByAssignedUserId(Long UserId);
}
