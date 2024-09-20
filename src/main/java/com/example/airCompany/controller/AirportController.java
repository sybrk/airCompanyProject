package com.example.airCompany.controller;

import com.example.airCompany.dto.AirportDto;
import com.example.airCompany.service.IAirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/airport")
public class AirportController {

    @Autowired
    private IAirportService iAirportService;

    @GetMapping("/{id}")
    public AirportDto getAirportById(@PathVariable int id) {
        return iAirportService.getAirportById(id);
    }

    @GetMapping("/all")
    public List<AirportDto> getAllAirports() {
        return iAirportService.getAllAirports();
    }

    @PostMapping("/")
    public AirportDto addAirport(@RequestBody AirportDto airportDto) {
        return iAirportService.addAirport(airportDto);
    }

    @PutMapping("/{id}")
    public AirportDto updateAirport(@PathVariable int id, @RequestBody AirportDto airportDto) {
        return iAirportService.updateAirport(id, airportDto);
    }

    @DeleteMapping("/{id}")
    public boolean deleteAirport(@PathVariable int id) {
        return iAirportService.deleteAirport(id);
    }
}
