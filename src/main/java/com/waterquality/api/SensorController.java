package com.waterquality.api;

import com.waterquality.dto.SensorDto;
import com.waterquality.service.SensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class SensorController {

    private final SensorService sensorService;









}