package com.waterquality.repository;

import com.waterquality.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Integer>, JpaSpecificationExecutor<Sensor> {

    List<Sensor> findAllByDeviceId(String deviceId);

    Sensor deleteSensorById(Integer id);

    @Query("select s from Sensor s where s.month = ?1")
    Optional<Sensor> findByMonth(Integer month);
}