package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class FlightInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int no;
    private String departure;
    private String arrival;
    @JsonBackReference

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;


    
}
