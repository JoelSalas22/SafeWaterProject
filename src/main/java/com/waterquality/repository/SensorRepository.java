package com.waterquality.repository;

import com.waterquality.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long>  {

        public Sensor newSensor(Sensor sensor);


        public Sensor getSensorById(Long id);

        public Sensor getSensorBySensorName(String sensorName);

        public List<Sensor> getSensorByLocationContainingIgnoreCaseOrderByLocation(String location);



        public Sensor updateSensorById(Sensor sensor, Long id);

        public Sensor deleteSensorById(Long id);

        public Sensor deleteSensorBySensorName(String sensorName);

        @Query("select s from Sensor s where s.isActive = ?1")
        public List<Sensor> getSensorByStatus (boolean status);


        public List<Sensor> getSensorsByYear(String year);

}