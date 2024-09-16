package com.example.airCompany.controller;

import com.example.airCompany.dto.AirCraftDto;
import com.example.airCompany.service.IAirCraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/aircraft")
public class AirCraftController {

    @Autowired
    @Qualifier()
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
}
