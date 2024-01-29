package com.waterquality.repository;

import com.github.javafaker.Faker;
import com.waterquality.dto.SensorDataDto;
import com.waterquality.dto.SensorDto;
import com.waterquality.entity.Sensor;
import com.waterquality.entity.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long>  {

    Sensor findSensorByName(String name);

    Sensor findSensorByDescription(String description);
    List<Sensor> findSensorsByNameStartingWithAndDescriptionIsNotNull(String name);

    List<Sensor> findSensorByActive(boolean status);

    Sensor findSensorByNameAndActive(String name, boolean status);

    Sensor findSensorByNameEquals(String name);

    List<Sensor> findSensorByNameIsNot(String name);

    List<Sensor> findSensorsByDescriptionIsNull();

    List<Sensor> findSensorsByDescriptionIsNotNull();

    List<Sensor> findSensorsByActiveIsTrue();
    List<Sensor> findSensorsByActiveIsFalse();


    List<Sensor> findSensorsByNameStartingWith(String name);


    List<Sensor> findSensorsByNameEndingWith(String name);


    List<Sensor> findSensorsByNameContainingOrderByName(String name);
    List<Sensor> findSensorsByNameContainingOrderByNameAsc(String name);

    List<Sensor> findSensorsByNameContainingOrderByNameDesc(String name);

}