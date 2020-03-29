package com.EisenBoard.WebAppDev.dto;

import java.util.Date;

public class TaskDTO {

    private String taskName;
    private Date goalCompletionDate;
    private Date taskDueDate;
    private String description;


    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getGoalCompletionDate() {
        return goalCompletionDate;
    }

    public void setGoalCompletionDate(Date goalCompletionDate) {
        this.goalCompletionDate = goalCompletionDate;
    }

    public Date getTaskDueDate() {
        return taskDueDate;
    }

    public void setTaskDueDate(Date taskDueDate) {
        this.taskDueDate = taskDueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskDTO(String taskName, Date goalCompletionDate, Date taskDueDate, String description, int guid) {
        this.taskName = taskName;
        this.goalCompletionDate = goalCompletionDate;
        this.taskDueDate = taskDueDate;
        this.description = description;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return taskName;
    }

}
