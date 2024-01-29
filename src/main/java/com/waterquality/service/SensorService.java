package com.waterquality.service;

import com.waterquality.dto.SensorDataDto;
import com.waterquality.dto.SensorDto;
import com.waterquality.entity.Sensor;
import com.waterquality.mapper.SensorMapper;
import com.waterquality.repository.SensorRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SensorService {
    private final SensorRepository sensorRepository;

    public SensorDto getSensorByName(String name) {
        return SensorMapper.mapToDto(sensorRepository.findSensorByName(name));
    }

    public SensorDto getSensorById(Long id) {
        return SensorMapper.mapToDto(sensorRepository.findById(id));

    }
}