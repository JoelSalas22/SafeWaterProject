package com.waterquality.service;

import com.waterquality.dto.SensorDto;
import com.waterquality.entity.Sensor;
import com.waterquality.mapper.SensorMapper;
import com.waterquality.repository.SensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

// methods for interacting with the database
// go in Sensor Service
//getSensorById
//getSensorByName
//getAllSensors
// getSensorsByStatus
// updateSensor
// updateandPatchSensor
// deleteSensor
@Service
@RequiredArgsConstructor
public class SensorService {
    private final SensorRepository sensorRepository;

    public SensorDto getSensorById(Long id) {
        Sensor sensor = sensorRepository.getSensorById(id);
        return SensorMapper.mapToDto(sensor);
    }

    public SensorDto getSensorByName(String name) {
        Sensor sensor = sensorRepository.getSensorBySensorName(name);
        return SensorMapper.mapToDto(sensor);
    }


    public List<SensorDto> getAllSensors() {
        List<Sensor> sensorList = sensorRepository.findAll();
        return SensorMapper.mapToDtoList(sensorList);
    }

    public List<SensorDto> getSensorsByStatus(boolean status) {
        List<Sensor> sensorList = sensorRepository.getAllByNotActive(status);
        return SensorMapper.mapToDtoList(sensorList);
    }



}
