package com.emse.spring.faircorp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "BUILDING")
public class Building {

    @Id
    @GeneratedValue
    private Long id;

    @JsonBackReference
    @OneToMany(mappedBy = "building")
    private Set<Room> roomList;

    @Column(nullable = false)
    private float outsideTemperature;

    @Column
    private String name;

    public Building() {
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

    public Building(float outsideTemperature, String name) {
        this.outsideTemperature = outsideTemperature;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRoomList(Set<Room> roomList) {
        this.roomList = roomList;
    }

    public void setOutsideTemperature(float outsideTemperature) {
        this.outsideTemperature = outsideTemperature;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Building(Set<Room> roomList, float outsideTemperature, String name) {
        this.roomList = roomList;
        this.outsideTemperature = outsideTemperature;
        this.name = name;
    }
}
