package com.example.airCompany.service.impl;

import com.example.airCompany.dto.FlightDto;
import com.example.airCompany.entity.Flight;
import com.example.airCompany.mapper.FlightMapper;
import com.example.airCompany.repository.IFlightRepository;
import com.example.airCompany.service.IFlightService;

import java.util.ArrayList;
import java.util.List;

public class FlightServiceImpl implements IFlightService {

    private IFlightRepository iFlightRepository;
    @Override
    public FlightDto getFlightById(int id) {
        Flight result = iFlightRepository.getById(id);
        return FlightMapper.FlightEntityToDto(result);
    }

    @Override
    public List<FlightDto> getAlLFlights() {
        List<Flight> flights = iFlightRepository.findAll();
        List<FlightDto> flightDtos = new ArrayList<>();
        for (int i = 0; i < flights.size(); i++) {
            FlightDto tmpFlightDto = FlightMapper.FlightEntityToDto(flights.get(i));
            flightDtos.add(tmpFlightDto);
        }
        return flightDtos;
    }

    @Override
    public FlightDto addFlight(FlightDto flightDto) {
        Flight newFlight = FlightMapper.FlightDtoToEntity(flightDto);
        Flight result = iFlightRepository.save(newFlight);
        return FlightMapper.FlightEntityToDto(result);
    }

    @Override
    public FlightDto updateFlight(int id, FlightDto flightDto) {
        return null;
    }

    @Override
    public boolean deleteFlight(int id) {
        return false;
    }
}
