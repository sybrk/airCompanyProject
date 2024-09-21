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
        return tmpAirport;
    }

    public static Airport UpdateAirportEntityFromDto (Airport airport, AirportDto airportDto) {
        airport.setAirportName(airportDto.getAirportName());
        airport.setAirportCode(airportDto.getAirportCode());
        return airport;
    }
}
