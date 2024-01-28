package com.waterquality.api;


import com.waterquality.dto.SensorDataDto;
import com.waterquality.service.SensorDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class SensorDataController {


    private SensorDataService sensorDataService;

    @GetMapping("/sensor")
    public List<SensorDataDto> getSensorData() {
        return sensorDataService.getSensorData();
    }

    @GetMapping("/sensor/{id}")
    public SensorDataDto getSensorDataById(@PathVariable int id) {
        return sensorDataService.getSensorDataById(id);
    }

    @PostMapping("/sensor")
    public void addSensorData(@RequestBody SensorDataDto sensorDataDto) {
        sensorDataService.addSensorData(sensorDataDto);
    }

    @PutMapping("/sensordata/{id}")
    public void updateSensorData(@RequestBody SensorDataDto sensorDataDto, @PathVariable int id) {
        sensorDataService.updateSensorData(sensorDataDto, id);
    }

    @DeleteMapping("/sensordata/{id}")
    public void deleteSensorData(@PathVariable int id) {
        sensorDataService.deleteSensorData(id);
    }

    @GetMapping("sensordatalist/{year}")
    public List<SensorDataDto> findResults_positionedparameter(@PathVariable String year) {
        return sensorDataService.findResults_positionedparameter(year);
    }
}
