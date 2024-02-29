package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FlightInfo;

public interface FlightInfoRepository extends JpaRepository<FlightInfo,Integer>{
    
}
