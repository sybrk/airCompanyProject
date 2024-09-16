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
        return AirCraftMapper.AirCraftDtoMapper(result);
    }

    @Override
    public List<AirCraftDto> getAllAirCrafts() {
        List<AirCraft> result = iAirCraftRepository.findAll();
        List<AirCraftDto> allAirCrafts = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            AirCraftDto tmpAirCraftDto = AirCraftMapper.AirCraftDtoMapper(result.get(i));
            allAirCrafts.add(tmpAirCraftDto);
        }
        return allAirCrafts;
    }


}
