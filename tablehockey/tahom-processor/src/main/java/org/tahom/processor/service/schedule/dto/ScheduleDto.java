package org.tahom.processor.service.schedule.dto;

import org.tahom.repository.model.Groups;

public class ScheduleDto {

    private Groups group;

    private boolean optimized;

    private int startHockey;

    public ScheduleDto() {
        this.startHockey = 1;
    }

    public Groups getGroup() {
        return group;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }

    public boolean isOptimized() {
        return optimized;
    }

    public void setOptimized(boolean optimized) {
        this.optimized = optimized;
    }

    public int getStartHockey() {
        return startHockey;
    }

    public void setStartHockey(int startHockey) {
        this.startHockey = startHockey;
    }

}
