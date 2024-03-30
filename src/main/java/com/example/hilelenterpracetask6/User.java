package com.example.hilelenterpracetask6;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Task> assignedTasks;

    public User(String username) {
        this.username = username;
        this.assignedTasks = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<Task> getAssignedTasks() {
        return assignedTasks;
    }

    public void assignTask(Task task) {
        assignedTasks.add(task);
    }

    public void unassignTask(Task task) {
        assignedTasks.remove(task);
    }
}