package com.waterquality.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "SensorData")
@ToString
@Data
public class SensorData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sensordata_id")
    private long id;
    @ManyToOne
    @JoinColumn(name="fk_sensor_id", nullable=false)
    private Sensor sensor;
    @ManyToOne
    @JoinColumn(name="fk_parameter_id", nullable=false)
    private Parameter parameter;
    @Column(name = "year")
    private String year;
    @Column(name = "month")
    private String month;
    @Column(name="value")
    private double parameterValue;
}
