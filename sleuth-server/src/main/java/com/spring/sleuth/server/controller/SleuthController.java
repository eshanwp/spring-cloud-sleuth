package com.spring.sleuth.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/server")
public class SleuthController {

    @Autowired
    private RestTemplate restTemplate;

    private Logger LOGGER = LoggerFactory.getLogger(SleuthController.class);

    @GetMapping(value = "/weather")
    public String getWeather(){

        LOGGER.info("Reached Server");
        String response = restTemplate.getForObject("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22", String.class);
        return response;

    }
}
