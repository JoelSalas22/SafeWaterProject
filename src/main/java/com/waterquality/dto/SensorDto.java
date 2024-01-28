package com.waterquality.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;


/*
    * DTO for {@link com.waterquality.entity.Sensor}
 */


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SensorDto {
    @Id
    @GeneratedValue
    private long sensorId;

    private String sensorName;

    private boolean isActive;

    private String location;
}