package com.waterquality;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class WaterQualityManagementApplication
{

    public static void main(String[] args)
    {

        ApplicationContext context =  SpringApplication.run(WaterQualityManagementApplication.class, args);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }

}
