package com.example.airCompany.mapper;

import com.example.airCompany.dto.LocationDto;
import com.example.airCompany.entity.Location;

public class LocationMapper {

    public static LocationDto LocationEntityToDto(Location location) {
        LocationDto locationDto = new LocationDto(location.getLocationName(),
                                    location.getCountry(),
                                    location.getCity());
        return locationDto;
    }

    public static Location LocationDtoToEntity(LocationDto locationDto) {
        Location location = new Location();
        location.setLocationName(locationDto.getLocationName());
        location.setCountry(locationDto.getCountry());
        location.setCity(locationDto.getCity());
        return location;
    }

    public static Location UpdateLocationEntityFromDto(Location location, LocationDto locationDto) {
        if(locationDto.getLocationName() != null) {
            location.setLocationName(locationDto.getLocationName());
        }
        if(locationDto.getCountry() != null) {
            location.setCountry(locationDto.getCountry());
        }
        if(locationDto.getCity() != null) {
            location.setCity(locationDto.getCity());
        }
        return location;
    }
}
