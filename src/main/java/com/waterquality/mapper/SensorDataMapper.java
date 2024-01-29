package com.waterquality.mapper;

import com.waterquality.dto.SensorDataDto;
import com.waterquality.dto.SensorDto;
import com.waterquality.entity.Parameter;
import com.waterquality.entity.Sensor;
import com.waterquality.entity.SensorData;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class SensorDataMapper {

    public static SensorDataDto toDTO(SensorData sensorData) {
        SensorDataDto dto = new SensorDataDto();
        dto.setId(sensorData.getId());
        dto.setSensorId(sensorData.getId());
        dto.setParameterId(sensorData.getParameter().getParameterId());
        dto.setYear(sensorData.getYear());
        dto.setMonth(sensorData.getMonth());
        dto.setParameterValue(sensorData.getParameterValue());
        return dto;
    }

    public static SensorData toEntity(SensorDataDto dto, Sensor sensor, Parameter parameter) {
        SensorData sensorData = new SensorData();
        sensorData.setId(dto.getId());
        sensorData.setSensor(sensor);
        sensorData.setParameter(parameter);
        sensorData.setYear(dto.getYear());
        sensorData.setMonth(dto.getMonth());
        sensorData.setParameterValue(dto.getParameterValue());
        return sensorData;
    }
}