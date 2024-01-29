package com.waterquality.mapper;

import com.waterquality.dto.SensorDto;
import com.waterquality.entity.Sensor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;



public class SensorMapper {

    public static Sensor toEntity(SensorDto sensorDto) {
        // Mapping from SensorDto to Sensor
        Sensor sensor = new Sensor();
        sensor.setId(sensorDto.getSensorId());
        sensor.setSensorName(sensorDto.getSensorName());
        sensor.setActive(sensorDto.isActive());
        sensor.setLocation(sensorDto.getLocation());
        return sensor;
    }

    public static SensorDto toDto(Sensor sensor) {
        // Mapping from Sensor to SensorDto
        SensorDto dto = new SensorDto();
        dto.setSensorId(sensor.getId());
        dto.setSensorName(sensor.getSensorName());
        dto.setActive(sensor.isActive());
        dto.setLocation(sensor.getLocation());

        return dto;
    }

}