package com.example.airCompany.mapper;

import com.example.airCompany.dto.AirCraftDto;
import com.example.airCompany.entity.AirCraft;

public class AirCraftMapper {

    public static AirCraftDto AirCraftDtoMapper(AirCraft airCraft) {
        return new AirCraftDto(airCraft.getName(),airCraft.getPurchaseDate(),
                                airCraft.getEcoCapacity(),airCraft.getBusinessCapacity(),
                                airCraft.getStatus(),airCraft.getIsDeleted(),airCraft.getCreatedAt(),
                                airCraft.getLastModifiedAt());
    }
}
