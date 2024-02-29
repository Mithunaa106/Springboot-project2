package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FlightInfo;
import com.example.demo.repository.FlightInfoRepository;

@Service
public class FlightInfoService {
    @Autowired
    private FlightInfoRepository flightInfoRepository;

    public FlightInfo post(FlightInfo flightInfo)
    {
        return flightInfoRepository.save(flightInfo);
    }

    public List<FlightInfo>want()
    {
        return flightInfoRepository.findAll();
    }
}
