package com.example.airCompany.service;

import com.example.airCompany.dto.AirCraftDto;
import com.example.airCompany.entity.AirCraft;

import java.util.List;

public interface IAirCraftService {

    AirCraftDto getAirCraftById(int id);
    List<AirCraftDto> getAllAirCrafts();
}
