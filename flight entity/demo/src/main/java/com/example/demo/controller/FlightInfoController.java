package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FlightInfo;
import com.example.demo.service.FlightInfoService;

@RestController
public class FlightInfoController {
    @Autowired
    private FlightInfoService flightInfoService;

    @PostMapping("/flightinfo")
    public FlightInfo postMethodName(@RequestBody FlightInfo flightInfo) {
        return flightInfoService.post(flightInfo);
     
    }

    @GetMapping("/flightinfo")
    public List<FlightInfo> getMethodName() {
        return flightInfoService.want();
    }
}
