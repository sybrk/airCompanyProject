package com.example.airCompany.service.impl;

import com.example.airCompany.dto.LocationDto;
import com.example.airCompany.entity.Location;
import com.example.airCompany.mapper.LocationMapper;
import com.example.airCompany.repository.ILocationRepository;
import com.example.airCompany.service.ILocationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Component
public class LocationServiceImpl implements ILocationService {

    private ILocationRepository iLocationRepository;
    @Override
    public LocationDto getLocationById(int id) {
        Location result = iLocationRepository.getById(id);
        if(result.getIsDeleted()) {
            return null;
        }
        return(LocationMapper.LocationEntityToDto(result));
    }

    @Override
    public List<LocationDto> getAllLocations() {
        List<Location> result = iLocationRepository.findAll();
        List<LocationDto> locationDtos = new ArrayList<>();
        for (int i = 0; i < result.size() ; i++) {
            LocationDto tmpLocationDto = LocationMapper.LocationEntityToDto(result.get(i));
            if(result.get(i).getIsDeleted() == false) {
                locationDtos.add(tmpLocationDto);
            }
        }
        return locationDtos;
    }

    @Override
    public LocationDto addLocation(LocationDto newLocation) {
        Location location = iLocationRepository.save(LocationMapper.LocationDtoToEntity(newLocation));
        LocationDto createdLocationDto = LocationMapper.LocationEntityToDto(location);
        return createdLocationDto;
    }

    @Override
    public LocationDto updateLocation(int id, LocationDto updatedLocation) {
        Location result = iLocationRepository.getById(id);
        result = LocationMapper.UpdateLocationEntityFromDto(result,updatedLocation);
        Location location = iLocationRepository.save(result);
        return LocationMapper.LocationEntityToDto(location);
    }

    @Override
    public boolean deleteLocation(int id) {
        Location result = iLocationRepository.getById(id);
        result.setIsDeleted(true);
        Location deletedLocation = iLocationRepository.save(result);
        if(deletedLocation.getIsDeleted()) {
            return true;
        }
        return false;
    }
}
