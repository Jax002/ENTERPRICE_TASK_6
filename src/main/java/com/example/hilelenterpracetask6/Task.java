package com.example.hilelenterpracetask6;

public class Task {
    private int taskId;
    private String taskTitle;
    private String taskDescription;
    private TaskStatus taskStatus;

    public Task(int taskId, String taskTitle, String taskDescription) {
        this.taskId = taskId;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.taskStatus = TaskStatus.NEW;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
}
