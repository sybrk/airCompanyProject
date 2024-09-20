package com.example.airCompany.service.entityManager;

import com.example.airCompany.dto.AirCraftDto;
import com.example.airCompany.entity.AirCraft;

import java.util.List;

public interface IAirCraftRepositoryManager {
    List<AirCraftDto> getAll();
}
