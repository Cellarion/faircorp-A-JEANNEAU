package com.emse.spring.faircorp.dto;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.HeaterStatus;

public class HeaterDto {
    private Long id;
    private String name;
    private HeaterStatus heaterStatus;
    private Long roomId;
    private String roomName;

    public String getRoomName() {
        return roomName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HeaterStatus getHeaterStatus() {
        return heaterStatus;
    }

    public Long getRoomId() {
        return roomId;
    }

    public HeaterDto() {
    }

    public HeaterDto(Heater heater) {
        this.id = heater.getId();
        this.name = heater.getName();
        this.heaterStatus = heater.getHeaterStatus();
        this.roomId = heater.getRoom().getId();
        this.roomName = heater.getRoom().getName();
    }
}
