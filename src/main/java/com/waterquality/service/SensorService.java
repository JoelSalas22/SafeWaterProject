package com.waterquality.service;

import com.waterquality.entity.Sensor;
import com.waterquality.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {
    // Where methods that interact with the database go, these would use a
    // SensorRepository object to interact with the database.
    private final SensorRepository sensorRepository;

    @Autowired
    public SensorService (SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public List<Sensor> getAllSensors() {
        return sensorRepository.findAll();


    }

    public void addNewSensor(Sensor sensor) {
        sensorRepository.save(sensor);
    }



}
