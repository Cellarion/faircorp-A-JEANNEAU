package com.emse.spring.faircorp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private int floor;

    @Column(nullable = false)
    private String name;


    @Column
    private Double currentTemperature;

    @Column
    private Double targetTemperature;

    @JsonBackReference
    @OneToMany(mappedBy = "room")
    private Set<Heater> heaters;

    @JsonBackReference
    @OneToMany(mappedBy = "room")
    private Set<Window> windows;

    public void setBuilding(Building building) {
        this.building = building;
    }

    @JsonManagedReference
    @ManyToOne
    private Building building;

    public Building getBuilding() {
        return building;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(Double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public Double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(Double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public Set<Heater> getHeaters() {
        return heaters;
    }

    public void setHeaters(Set<Heater> heaters) {
        this.heaters = heaters;
    }

    public Set<Window> getWindows() {
        return windows;
    }

    public void setWindows(Set<Window> windows) {
        this.windows = windows;
    }

    public Room() {
    }

    public Room(int floor, String name, Double currentTemperature, Double targetTemperature, Set<Heater> heaters, Set<Window> windows, Building building) {
        this.floor = floor;
        this.name = name;
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
        this.heaters = heaters;
        this.windows = windows;
        this.building = building;
    }

    public Room(int floor, String name, Building building) {
        this.floor = floor;
        this.name = name;
        this.building = building;
    }

}
