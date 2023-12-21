package com.waterquality.repository;

import com.waterquality.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Integer>, JpaSpecificationExecutor<Sensor> {

    List<Sensor> findAllByDeviceId(String deviceId);

    List<Sensor> findAllByDeviceIdAndMonth(String deviceId, Integer month);

    Sensor addNewSensor(Sensor sensor);

    Sensor deleteSensorById(Integer id);

}