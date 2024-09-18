package com.example.airCompany.mapper;

import com.example.airCompany.dto.AirCraftDto;
import com.example.airCompany.entity.AirCraft;

public class AirCraftMapper {

    public static AirCraftDto AirCraftEntityToDtoMapper(AirCraft airCraft) {
        return new AirCraftDto(airCraft.getName(),airCraft.getPurchaseDate(),
                                airCraft.getEcoCapacity(),airCraft.getBusinessCapacity());
    }

    public static AirCraft AirCraftDtoToEntityMapper(AirCraftDto airCraftDto) {
        AirCraft tmpAircraft = new AirCraft();
        tmpAircraft.setName(airCraftDto.getName());
        tmpAircraft.setPurchaseDate(airCraftDto.getPurchaseDate());
        tmpAircraft.setEcoCapacity(airCraftDto.getEcoCapacity());
        tmpAircraft.setBusinessCapacity(airCraftDto.getBusinessCapacity());
        return tmpAircraft;
    }

    public static AirCraft UpdateAirCraftEntityFromDto(AirCraft airCraft, AirCraftDto airCraftDto) {
        if(airCraftDto.getName() != null) {
            airCraft.setName(airCraftDto.getName());
        }
        if(airCraftDto.getPurchaseDate() != null) {
            airCraft.setPurchaseDate(airCraftDto.getPurchaseDate());
        }
        if(airCraftDto.getEcoCapacity() != null) {
            airCraft.setEcoCapacity(airCraftDto.getEcoCapacity());
        }
        if(airCraftDto.getBusinessCapacity() != null) {
            airCraft.setBusinessCapacity(airCraftDto.getBusinessCapacity());
        }
        return airCraft;
    }
}
