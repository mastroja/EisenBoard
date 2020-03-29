package com.EisenBoard.WebAppDev.dto;

import java.util.Date;

public class TaskDTO {

    private String taskName;
    private Date goalCompletionDate;
    private Date taskDueDate;
    private String description;
    private Integer rank;


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

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public TaskDTO(String taskName, Date goalCompletionDate, Date taskDueDate, String description, int guid, Integer rank) {
        this.taskName = taskName;
        this.goalCompletionDate = goalCompletionDate;
        this.taskDueDate = taskDueDate;
        this.description = description;
        this.rank = rank;
    }

    public TaskDTO() {
    }

    public TaskDTO(String taskName, Date taskDueDate, String description, Integer rank) {
        this.taskName = taskName;
        this.taskDueDate = taskDueDate;
        this.description = description;
        this.rank = rank;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return taskName;
    }

}
