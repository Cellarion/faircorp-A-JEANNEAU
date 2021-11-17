package com.emse.spring.faircorp.dto;

import com.emse.spring.faircorp.model.Building;
import com.emse.spring.faircorp.model.Room;

import java.util.Set;

public class BuildingDto {
    private Long id;
    private Set<Room> roomList;
    private float outsideTemperature;
    private String name;

    public BuildingDto() {
    }

    public BuildingDto(Building building) {
        this.id = building.getId();
        this.roomList = building.getRoomList();
        this.outsideTemperature = building.getOutsideTemperature();
        this.name = building.getName();
    }


    public Long getId() {
        return id;
    }

    public Set<Room> getRoomList() {
        return roomList;
    }

    public float getOutsideTemperature() {
        return outsideTemperature;
    }

    public String getName() {
        return name;
    }
}
