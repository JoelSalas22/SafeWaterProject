package com.waterquality.entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sensors")
@Entity
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "device_id", nullable = false, length = Integer.MAX_VALUE)
    private String deviceId;

    @Column(name = "month", nullable = false)
    private int month;

    @Column(name = "year", nullable = false)
    private int year;

    @Column(name = "ph", nullable = false)
    private float ph;

    @Column(name = "ba", nullable = false)
    private float ba;

    @Column(name = "cu", nullable = false)
    private float cu;

    @Column(name = "fe", nullable = false)
    private float fe;

    @Column(name = "viruses", nullable = false)
    private float viruses;

}