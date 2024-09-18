package com.example.airCompany.controller;

import com.example.airCompany.dto.AirCraftDto;
import com.example.airCompany.service.IAirCraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/aircraft")
public class AirCraftController {

    @Autowired
    private IAirCraftService iAirCraftService;

    @GetMapping({"", "/"})
    public String testConnection() {
        return "ok";
    }
    @GetMapping("/{id}")
    public AirCraftDto getAirCraftById(@PathVariable int id ) {
        return iAirCraftService.getAirCraftById(id);
    }

    @GetMapping("/all")
    public List<AirCraftDto> getAllAirCrafts() {
        return iAirCraftService.getAllAirCrafts();
    }

    @PostMapping("/")
    public AirCraftDto addNewAirCraft(@RequestBody AirCraftDto airCraftDto) {
        return iAirCraftService.addNewAirCraft(airCraftDto);
    }

    @PutMapping("/{id}")
    public AirCraftDto updateAirCraft(@PathVariable int id, @RequestBody AirCraftDto airCraftDto) {
        return iAirCraftService.updateAirCraft(id, airCraftDto);
    }

    @DeleteMapping("/{id}")
    public boolean deleteAirCraft(@PathVariable int id) {
        return iAirCraftService.deleteAirCraft(id);
    }
}
