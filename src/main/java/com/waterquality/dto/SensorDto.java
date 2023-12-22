package com.waterquality.dto;

import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link com.waterquality.entity.Sensor}
 */
@Value
public class SensorDto implements Serializable {
    Integer id;
    String deviceId;
    Integer month;
    int year;
    float ph;
    float ba;
    float cu;
    float fe;
    float viruses;

    // decimal in java is a

}