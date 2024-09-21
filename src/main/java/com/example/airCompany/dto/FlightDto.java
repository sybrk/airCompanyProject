package com.example.airCompany.dto;


import com.example.airCompany.entity.AirCraft;
import com.example.airCompany.entity.Airport;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class FlightDto {

    private String FlightNumber;
    private AirportDto OriginAirport;
    private AirportDto DestinationAirport;
    private AirCraftDto AirCraft;
    private Date DepartureTime;
}
