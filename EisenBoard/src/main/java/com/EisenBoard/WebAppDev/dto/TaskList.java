package com.EisenBoard.WebAppDev.dto;

import java.util.List;

public class TaskList {

    private List<TaskDTO> plants = null;

    public List<TaskDTO> getPlants() {
        return plants;
    }

    public void setPlants(List<TaskDTO> plants) {
        this.plants = plants;
    }

}
