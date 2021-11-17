package com.emse.spring.faircorp.dto;

import com.emse.spring.faircorp.model.Window;
import com.emse.spring.faircorp.model.WindowStatus;

public class WindowDto {
    private Long id;
    private String name;
    private WindowStatus windowStatus;
    private String roomName;
    private Long roomId;


    public String getRoomName() {
        return roomName;
    }


    public WindowDto() {
    }

    public WindowDto(Window window) {
        this.id = window.getId();
        this.name = window.getName();
        this.windowStatus = window.getWindowStatus();
        this.roomId = window.getRoom().getId();
        this.roomName = window.getRoom().getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public WindowStatus getWindowStatus() {
        return windowStatus;
    }

    public long getRoomId() {
        return roomId;
    }
}
