package com.EisenBoard.WebAppDev.dto;

import java.util.ArrayList;

public class WeeklyScheduleDTO {

    public ArrayList<ArrayList<TaskDTO>> getWeeklyTaskList() {
        return weeklyTaskList;
    }

    public void setWeeklyTaskList(ArrayList<ArrayList<TaskDTO>> weeklyTaskList) {
        this.weeklyTaskList = weeklyTaskList;
    }

    private ArrayList<ArrayList<TaskDTO>> weeklyTaskList;

}
