package com.waterquality.mapper;

import com.waterquality.dto.SensorDataDto;
import com.waterquality.entity.SensorData;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class SensorDataMapper {

    public SensorDataDto mapToDto(SensorData sensorData) {
        SensorDataDto dto = new SensorDataDto();
        dto.setId(sensorData.getId());
        dto.setSensor(sensorData.getSensor());
        dto.setParameter(sensorData.getParameter());
        dto.setYear(sensorData.getYear());
        dto.setMonth(sensorData.getMonth());
        dto.setParameterValue(sensorData.getParameterValue());
        return dto;
    }

    public SensorData mapToEntity(SensorDataDto sensorDataDto) {
        SensorData sensorData = new SensorData();
        sensorData.setId(sensorDataDto.getId());
        sensorData.setSensor(sensorDataDto.getSensor());
        sensorData.setParameter(sensorDataDto.getParameter());
        sensorData.setYear(sensorDataDto.getYear());
        sensorData.setMonth(sensorDataDto.getMonth());
        sensorData.setParameterValue(sensorDataDto.getParameterValue());
        return sensorData;
    }

    public List<SensorData> toEntityList(List<SensorDataDto> sensorDataDtoList) {
        List<SensorData> sensorDataList = new ArrayList<>();
        for (SensorDataDto sensorDataDto : sensorDataDtoList) {
            sensorDataList.add(mapToEntity(sensorDataDto));
        }
        return sensorDataList;
    }

    public List<SensorDataDto> toDtoList(List<SensorData> sensorDataList) {
        List<SensorDataDto> sensorDataDtoList = new ArrayList<>();
        for (SensorData sensorData : sensorDataList) {
            sensorDataDtoList.add(mapToDto(sensorData));
        }
        return sensorDataDtoList;
    }
}