package com.example.airCompany.service;

import com.example.airCompany.dto.LocationDto;

import java.util.List;

public interface ILocationService {

    LocationDto getLocationById(int id);
    List<LocationDto> getAllLocations();
    LocationDto addLocation(LocationDto newLocation);
    LocationDto updateLocation(int id, LocationDto updatedLocation);
    boolean deleteLocation(int id);
}
