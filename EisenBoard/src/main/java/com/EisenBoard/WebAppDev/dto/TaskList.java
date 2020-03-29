package com.EisenBoard.WebAppDev.dto;

import java.util.List;

public class TaskList {

    private List<TaskDTO> tasks = null;

    public List<TaskDTO> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskDTO> tasks) {
        this.tasks = tasks;
    }

}
