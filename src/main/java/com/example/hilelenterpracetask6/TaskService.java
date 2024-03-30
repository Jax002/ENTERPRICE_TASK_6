package com.example.hilelenterpracetask6;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskService {
    private Map<Integer, Task> tasks = new HashMap<>();

    public void addTask(int taskId, String taskTitle, String taskDescription) {
        tasks.put(taskId, new Task(taskId, taskTitle, taskDescription));
    }

    public Task getTask(String taskId) {
        return tasks.get(taskId);
    }

    public void assignTask(int taskId, String username, UserService userService) {
        Task task = tasks.get(taskId);
        if (task != null) {
            User user = userService.getUser(username);
            if (user != null) {
                user.assignTask(task);
            }
        }
    }

    public List<Task> findTasksByStatus(TaskStatus status) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks.values()) {
            if (task.getTaskStatus() == status) {
                result.add(task);
            }
        }
        return result;
    }
}
