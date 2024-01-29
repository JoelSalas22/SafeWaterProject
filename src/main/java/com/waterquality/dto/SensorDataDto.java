package com.waterquality.dto;

import com.waterquality.entity.Parameter;
import com.waterquality.entity.Sensor;
import lombok.*;
/*
  * DTO for {@link com.waterquality.entity.SensorData}
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SensorDataDto {
    private long id;

    private long sensorId;

    private long parameterId;

    private String year;

    private String month;

    private double parameterValue;
}
