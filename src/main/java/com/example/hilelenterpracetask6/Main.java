package com.example.hilelenterpracetask6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);


        TaskService taskService = context.getBean(TaskService.class);
        UserService userService = context.getBean(UserService.class);


        taskService.addTask(1, "Task 1", "Description 1");
        userService.addUser("Evgen");
        taskService.assignTask(1, "Evgen", userService);


        context.close();
    }
}