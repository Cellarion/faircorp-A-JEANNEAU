package com.emse.spring.faircorp.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "RWINDOW")
public class Window {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private WindowStatus windowStatus;

    public void setRoom(Room room) {
        this.room = room;
    }

    @JsonManagedReference
    @ManyToOne
    private Room room;


    public Window() {
    }

    public Window(String name, WindowStatus status) {
        this.windowStatus = status;
        this.name = name;
    }

    public Window(String name, WindowStatus windowStatus, Room room) {
        this.name = name;
        this.windowStatus = windowStatus;
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WindowStatus getWindowStatus() {
        return windowStatus;
    }

    public void setWindowStatus(WindowStatus windowStatus) {
        this.windowStatus = windowStatus;
    }
}