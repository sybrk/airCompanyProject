package com.example.airCompany.mapper;

import com.example.airCompany.dto.AirportDto;
import com.example.airCompany.entity.Airport;

public class AirportMapper {

    public static AirportDto AirportEntityToDto (Airport airport) {
        return new AirportDto(
                airport.getAirportName(),
                airport.getAirportCode(),
                LocationMapper.LocationEntityToDto(airport.getLocation())
        );
    }

    public static Airport AirportDtoToEntity (AirportDto airportDto) {
        Airport tmpAirport = new Airport();
        tmpAirport.setAirportName(airportDto.getAirportName());
        tmpAirport.setAirportCode(airportDto.getAirportCode());
        tmpAirport.setLocation(LocationMapper.LocationDtoToEntity(airportDto.getLocation()));
        return tmpAirport;
    }

    public static Airport UpdateAirportEntityFromDto (Airport airport, AirportDto airportDto) {
        airport.setAirportName(airportDto.getAirportName());
        airport.setAirportCode(airportDto.getAirportCode());
        airport.setLocation(LocationMapper.LocationDtoToEntity(airportDto.getLocation()));
        return airport;
    }
}
