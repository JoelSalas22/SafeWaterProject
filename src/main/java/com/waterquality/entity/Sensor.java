package com.waterquality.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;



@Table(name = "Sensor")
@Entity
@ToString
@Data
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sensor_id")
    private long id;
    @Column(name = "sensor_name")

    private String sensorName;
    @Column(name = "is_active")
    private boolean active;
    @Column(name = "location")
    private String location;
}

