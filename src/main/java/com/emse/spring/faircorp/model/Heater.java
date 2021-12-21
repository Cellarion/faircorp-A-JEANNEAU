package com.emse.spring.faircorp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "HEATER")
public class Heater {


    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private Long power;

    @JsonBackReference
    @ManyToOne
    private Room room;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private HeaterStatus heaterStatus;

    public Heater() {
    }

    public Heater(String name, Room room, HeaterStatus heaterStatus) {
        this.name = name;
        this.room = room;
        this.heaterStatus = heaterStatus;
    }

    public Heater(String name, Long power, Room room, HeaterStatus heaterStatus) {
        this.name = name;
        this.power = power;
        this.room = room;
        this.heaterStatus = heaterStatus;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getPower() {
        return power;
    }

    public Room getRoom() {
        return room;
    }

    public HeaterStatus getHeaterStatus() {
        return heaterStatus;
    }

    public void setHeaterStatus(HeaterStatus heaterStatus) {
        this.heaterStatus = heaterStatus;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
