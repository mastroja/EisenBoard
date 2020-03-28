package com.EisenBoard.WebAppDev.model;

import java.util.Date;


public class Activity {
    private String activityName;
    private Date goalCompletionDate;
    private Date mustBeCompletedByDate;
    private String additionalNotes;



    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Date getGoalCompletionDate() {
        return goalCompletionDate;
    }

    public void setGoalCompletionDate(Date goalCompletionDate) {
        this.goalCompletionDate = goalCompletionDate;
    }

    public Date getMustBeCompletedByDate() {
        return mustBeCompletedByDate;
    }

    public void setMustBeCompletedByDate(Date mustBeCompletedByDate) {
        this.mustBeCompletedByDate = mustBeCompletedByDate;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    public Activity(String activityName, Date goalCompletionDate, Date mustBeCompletedByDate, String additionalNotes) {
        this.activityName = activityName;
        this.goalCompletionDate = goalCompletionDate;
        this.mustBeCompletedByDate = mustBeCompletedByDate;
        this.additionalNotes = additionalNotes;
    }
}
