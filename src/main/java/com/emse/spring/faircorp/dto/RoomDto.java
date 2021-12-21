package com.emse.spring.faircorp.dto;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Room;
import com.emse.spring.faircorp.model.Window;

import java.util.Set;

public class RoomDto {
    private Long id;
    private int floor;
    private Double currentTemperature;
    private Double targetTemperature;
    private Set<Heater> heaters;
    private Set<Window> windows;
    private Long buildingId;
    private String buildingName;
    private String name;


    public Long getId() {
        return id;
    }

    public RoomDto() {
    }

    public RoomDto(Room room) {
        this.id = room.getId();
        this.floor = room.getFloor();
        this.name = room.getName();
        this.currentTemperature = room.getCurrentTemperature();
        this.targetTemperature = room.getTargetTemperature();
        this.windows = room.getWindows();
        this.heaters = room.getHeaters();
        this.buildingId = room.getBuilding().getId();
        this.buildingName = room.getBuilding().getName();
    }

    public int getFloor() {
        return floor;
    }

    public Double getCurrentTemperature() {
        return currentTemperature;
    }

    public Double getTargetTemperature() {
        return targetTemperature;
    }

    public String getName() {
        return name;
    }

    public Set<Heater> getHeaters() {
        return heaters;
    }

    public Set<Window> getWindows() {
        return windows;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

}
