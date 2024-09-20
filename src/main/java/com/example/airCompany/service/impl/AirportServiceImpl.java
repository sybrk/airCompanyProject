package com.example.airCompany.service.impl;

import com.example.airCompany.dto.AirCraftDto;
import com.example.airCompany.dto.AirportDto;
import com.example.airCompany.entity.Airport;
import com.example.airCompany.mapper.AirportMapper;
import com.example.airCompany.repository.IAirportRepository;
import com.example.airCompany.service.IAirportService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Component
public class AirportServiceImpl implements IAirportService {

    private IAirportRepository iAirportRepository;
    @Override
    public AirportDto getAirportById(int id) {
        Airport result = iAirportRepository.getById(id);

        return AirportMapper.AirportEntityToDto(result);
    }

    @Override
    public List<AirportDto> getAllAirports() {

        List<Airport> result = iAirportRepository.findAll();
        List<AirportDto> airportDtos = new ArrayList<>();

        for (int i = 0; i < result.size(); i++) {
            AirportDto tmpAirportDto = AirportMapper.AirportEntityToDto(result.get(i));
            airportDtos.add(tmpAirportDto);
        }

        return airportDtos;
    }

    @Override
    public AirportDto addAirport(AirportDto airportDto) {
        Airport newAirport = iAirportRepository.save(AirportMapper.AirportDtoToEntity(airportDto));

        return AirportMapper.AirportEntityToDto(newAirport);
    }

    @Override
    public AirportDto updateAirport(int id, AirportDto airportDto) {
        Airport result = iAirportRepository.getById(id);
        result = AirportMapper.UpdateAirportEntityFromDto(result, airportDto);
        Airport updatedAirport = iAirportRepository.save(result);
        return AirportMapper.AirportEntityToDto(updatedAirport);
    }

    @Override
    public boolean deleteAirport(int id) {
        Airport result = iAirportRepository.getById(id);
        result.setIsDeleted(true);
        return result.getIsDeleted();
    }
}
