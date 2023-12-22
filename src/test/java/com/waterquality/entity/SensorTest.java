package com.waterquality.entity;
// Unit Tests
import com.waterquality.repository.SensorRepository;
import jakarta.persistence.*;
import lombok.*;
import lombok.Getter;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.JdbcTransactionObjectSupport;
import org.springframework.test.context.ActiveProfiles;

//import junit

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@ActiveProfiles("test")
class SensorTest {

    public void setUp() throws Exception {
        // Create SQL Test Database
        // Create Sensor Table
        // Create Sensor Object
    }

    @Test
    void testToString() {

    }
}