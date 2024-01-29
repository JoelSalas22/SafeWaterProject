package com.waterquality.repository;

import com.waterquality.entity.Sensor;
import com.waterquality.entity.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SensorDataRepository extends JpaRepository<SensorData, Long> {


    List<SensorData> findSensorDataBySensor(Sensor sensor);
    List<SensorData> findBySensorAndYearAndMonth(Sensor sensor, String year, String month);

    List<SensorData> findSensorDataByParameterValueLessThan(double parameterValue);
    List<SensorData> findSensorDataByParameterValueLessThanEqual(double parameterValue);

    List<SensorData> findSensorDataByParameterValueGreaterThan(double parameterValue);
    List<SensorData> findSensorDataByParameterValueGreaterThanEqual(double parameterValue);

    List<SensorData> findSensorDataByParameterValueBetween(double parameterValue1, double parameterValue2);


}
