package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AppConfig {

    //@Bean
    public SimpleTimer simpleTimer() {
        return new SimpleTimer();
    }
}
