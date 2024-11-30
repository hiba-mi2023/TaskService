package com.service1.task.service.controller;

import com.service1.task.service.modal.Task;
import com.service1.task.service.modal.TaskStatus;
import com.service1.task.service.modal.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/tasks")
    public ResponseEntity<String> getAssignedUsersTask() {


        return new ResponseEntity<>("welcome to task service",HttpStatus.OK);
    }
}
