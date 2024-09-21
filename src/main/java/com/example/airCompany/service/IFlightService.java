package com.example.airCompany.service;

import com.example.airCompany.dto.FlightDto;

import java.util.List;

public interface IFlightService {

    FlightDto getFlightById(int id);
    List<FlightDto> getAlLFlights();
    FlightDto addFlight(FlightDto flightDto);
    FlightDto updateFlight(int id, FlightDto flightDto);
    boolean deleteFlight(int id);
}
