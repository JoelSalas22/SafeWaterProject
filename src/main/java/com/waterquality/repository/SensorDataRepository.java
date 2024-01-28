package com.waterquality.repository;

import com.waterquality.entity.Sensor;
import com.waterquality.entity.SensorData;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import java.util.List;
@Transactional
@Repository
public interface SensorDataRepository extends JpaRepository<SensorData, Long> {

    public SensorData getSensorDataById(Long id);

    List<SensorData> findBySensorAndYearAndMonth(Sensor sensor, String year, String month);

    List<SensorData> findBySensorAndYear(Sensor sensor, String year);

    @Query("select sd from SensorData sd where sd.year = ?1")
    List<SensorData> findSensorDataByYear(String year);



}
