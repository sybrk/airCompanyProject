package com.example.airCompany.controller;


import com.example.airCompany.dto.LocationDto;

import com.example.airCompany.service.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/location")
public class LocationController {

    @Autowired
    private ILocationService iLocationService;

    @GetMapping("/{id}")
    public LocationDto getLocationById(@PathVariable int id ) {
        return iLocationService.getLocationById(id);
    }

    @GetMapping("/all")
    public List<LocationDto> getAllLocations() {
        return iLocationService.getAllLocations();
    }

    @PostMapping("/")

    public LocationDto addLocation(@RequestBody LocationDto locationDto) {
        return iLocationService.addLocation(locationDto);
    }

    @PutMapping("/{id}")

    public LocationDto updateLocation( @PathVariable int id, @RequestBody LocationDto locationDto) {
        return iLocationService.updateLocation(id,locationDto);
    }

    @DeleteMapping("/{id}")

    public boolean deleteLocation( @PathVariable int id) {
        return iLocationService.deleteLocation(id);
    }

}
