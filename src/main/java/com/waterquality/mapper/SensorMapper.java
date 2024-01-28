package com.waterquality.mapper;

import com.waterquality.dto.SensorDataDto;
import com.waterquality.dto.SensorDto;
import com.waterquality.entity.Sensor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
public class SensorMapper {
    public static Sensor mapToEntity(SensorDto sensorDto) {
        // Mapping from SensorDto to Sensor
        Sensor sensor = new Sensor();
        sensor.setId(sensorDto.getSensorId());
        sensor.setSensorName(sensorDto.getSensorName());
        sensor.setActive(sensorDto.isActive());
        sensor.setLocation(sensorDto.getLocation());
        return sensor;
    }

    public static SensorDto mapToDto(Sensor sensor) {
        // Mapping from Sensor to SensorDto
        SensorDto dto = new SensorDto();
        dto.setSensorId(sensor.getId());
        dto.setSensorName(sensor.getSensorName());
        dto.setActive(sensor.isActive());
        dto.setLocation(sensor.getLocation());

        return dto;
    }
    // Mapping from List<Sensor> to List<SensorDto>
    public static List<SensorDto> mapToDtoList(List<Sensor> sensorList) {
        List<SensorDto> sensorDtoList = new ArrayList<>();
        for (Sensor sensor : sensorList) {
            sensorDtoList.add(mapToDto(sensor));

        }
        return sensorDtoList;
    }
}