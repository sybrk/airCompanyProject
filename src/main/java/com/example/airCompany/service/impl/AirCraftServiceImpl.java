package com.example.airCompany.service.impl;

import com.example.airCompany.dto.AirCraftDto;
import com.example.airCompany.entity.AirCraft;
import com.example.airCompany.mapper.AirCraftMapper;
import com.example.airCompany.repository.IAirCraftRepository;
import com.example.airCompany.service.IAirCraftService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Component
public class AirCraftServiceImpl implements IAirCraftService {

    private IAirCraftRepository iAirCraftRepository;


    @Override
    public AirCraftDto getAirCraftById(int id) {
        AirCraft result = iAirCraftRepository.getById(id);
        if(result.getIsDeleted() == true) {
            return null;
        }
        return AirCraftMapper.AirCraftEntityToDtoMapper(result);
    }

    @Override
    public List<AirCraftDto> getAllAirCrafts() {
        List<AirCraft> result = iAirCraftRepository.findAll();
        List<AirCraftDto> allAirCrafts = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            if(result.get(i).getIsDeleted() == false) {
                AirCraftDto tmpAirCraftDto = AirCraftMapper.AirCraftEntityToDtoMapper(result.get(i));
                allAirCrafts.add(tmpAirCraftDto);
            }
        }
        return allAirCrafts;
    }

    @Override
    public AirCraftDto addNewAirCraft(AirCraftDto newAirCraft) {

        AirCraft savedAirCraft = iAirCraftRepository.save(AirCraftMapper.AirCraftDtoToEntityMapper(newAirCraft));

        return AirCraftMapper.AirCraftEntityToDtoMapper(savedAirCraft);
    }

    @Override
    public AirCraftDto updateAirCraft(int id, AirCraftDto airCraftDto) {
        AirCraft result = iAirCraftRepository.getById(id);
        result = AirCraftMapper.UpdateAirCraftEntityFromDto(result, airCraftDto);
        AirCraft updatedAirCraft = iAirCraftRepository.save(result);
        return AirCraftMapper.AirCraftEntityToDtoMapper(updatedAirCraft);
    }

    @Override
    public boolean deleteAirCraft(int id) {
        AirCraft result = iAirCraftRepository.getById(id);
        result.setIsDeleted(true);
        AirCraft deletedAircraft = iAirCraftRepository.save(result);
        if(deletedAircraft.getIsDeleted() == true) {
            return true;
        }
        return false;
    }
}
