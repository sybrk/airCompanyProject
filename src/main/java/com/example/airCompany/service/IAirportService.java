package com.example.airCompany.service;

import com.example.airCompany.dto.AirCraftDto;
import com.example.airCompany.dto.AirportDto;

import java.util.List;

public interface IAirportService {

    AirportDto getAirportById(int id);
    List<AirportDto> getAllAirports();
    AirportDto addAirport(AirportDto airportDto);
    AirportDto updateAirport(int id, AirportDto airportDto);
    boolean deleteAirport(int id);
}
