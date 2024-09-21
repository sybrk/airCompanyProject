package com.example.airCompany.mapper;

import com.example.airCompany.dto.FlightDto;
import com.example.airCompany.entity.Flight;

public class FlightMapper {

    public static FlightDto FlightEntityToDto(Flight flight) {

        return new FlightDto(
                flight.getFlightNumber(),
                AirportMapper.AirportEntityToDto(flight.getDestinationAirport()),
                AirportMapper.AirportEntityToDto(flight.getOriginAirport()),
                AirCraftMapper.AirCraftEntityToDtoMapper(flight.getAirCraft()),
                flight.getDepartureTime()
        );
    }
}
