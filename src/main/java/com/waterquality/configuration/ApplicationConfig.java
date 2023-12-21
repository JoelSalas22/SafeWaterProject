package com.waterquality.configuration;

import com.waterquality.util.ApplicationUtilities;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig
{

    @Bean
    public ApplicationUtilities applicationUtilities()
    {
        return new ApplicationUtilities();
    }
}
