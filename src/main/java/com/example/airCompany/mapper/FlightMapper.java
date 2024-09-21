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

    public static Flight FlightDtoToEntity(FlightDto flightDto) {
        Flight tmpFlight = new Flight();
        tmpFlight.setFlightNumber(flightDto.getFlightNumber());
        tmpFlight.setOriginAirport(AirportMapper.AirportDtoToEntity(flightDto.getOriginAirport()));
        tmpFlight.setDestinationAirport(AirportMapper.AirportDtoToEntity(flightDto.getDestinationAirport()));
        tmpFlight.setAirCraft(AirCraftMapper.AirCraftDtoToEntityMapper(flightDto.getAirCraft()));
        tmpFlight.setDepartureTime(flightDto.getDepartureTime());
        return tmpFlight;
    }

    public static Flight UpdateFlightEntityFromDto(Flight flight, FlightDto flightDto) {
        flight.setFlightNumber(flightDto.getFlightNumber());
        flight.setOriginAirport(AirportMapper.AirportDtoToEntity(flightDto.getOriginAirport()));
        flight.setDestinationAirport(AirportMapper.AirportDtoToEntity(flightDto.getDestinationAirport()));
        flight.setAirCraft(AirCraftMapper.AirCraftDtoToEntityMapper(flightDto.getAirCraft()));
        flight.setDepartureTime(flightDto.getDepartureTime());

        return flight;
    }
}
