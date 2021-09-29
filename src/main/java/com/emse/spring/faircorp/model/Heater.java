package com.emse.spring.faircorp.model;

import javax.persistence.*;
@Entity
@Table(name = "HEATER")
public class Heater {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    @Column
    private Long power;

    @ManyToOne
    private Room room;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private HeaterStatus heaterStatus;

    public Heater() {
    }

    public Heater(long id, String name, Room room, HeaterStatus heaterStatus) {
        this.id = id;
        this.name = name;
        this.room = room;
        this.heaterStatus = heaterStatus;
    }


}
