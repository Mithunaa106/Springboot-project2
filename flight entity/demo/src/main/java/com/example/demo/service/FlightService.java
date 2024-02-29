package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Flight;
import com.example.demo.repository.FlightRepository;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public Flight post(Flight flight)
    {
        return flightRepository.save(flight);
    }

    public List<Flight> want()
    {
        return flightRepository.findAll();
    }

    public Page<Flight> paginationFlight(int offset,int pagesize)
    {
        return flightRepository.findAll(PageRequest.of(offset,pagesize));
    }
    public Page<Flight> pageSortFlight(int offset,int pagesize,String field)
    {
        PageRequest pageRequest=PageRequest.of(offset, pagesize , Sort.by(field));
        return flightRepository.findAll(pageRequest);
    }
}
