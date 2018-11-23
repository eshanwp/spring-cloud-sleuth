package com.example.sleuth.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/client")
public class SleuthController {

    @Autowired
    private RestTemplate restTemplate;

    private Logger LOGGER = LoggerFactory.getLogger(SleuthController.class);

    @GetMapping(value = "/weather")
    public String getWeather(){

        LOGGER.info("Before Calling the Server");
        String response = restTemplate.getForObject("http://localhost:8081/api/server/weather", String.class);
        LOGGER.info("After Calling the Server");
        return response;

    }

}
