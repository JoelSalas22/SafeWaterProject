package com.waterquality.service;

import com.waterquality.entity.SensorData;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import com.waterquality.dto.SensorDto;
import com.waterquality.dto.SensorDataDto;

@Service
public class SensorDataService {

    private List<SensorDataDto> sensorDataDtoList = new ArrayList<>();


    public void addSensorData(SensorDataDto sensorDataDto) {
    }

    public void updateSensorData(SensorDataDto sensorDataDto, int id) {

    }

    public SensorDataDto getSensorDataById(int id) {
        return null;
    }

    public void deleteSensorData(int id) {

    }

    public List<SensorDataDto> getSensorData() {
        return sensorDataDtoList;
    }

    List<SensorDataDto> findResults_positionedparameter(String year) {
        List<SensorData> sensorDataList = sensorDataRepository.findSensorDataByYear(year);
    }
}