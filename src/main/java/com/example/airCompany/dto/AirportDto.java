package com.example.airCompany.dto;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AirportDto {

    private String AirportName;
    private String AirportCode;
    private LocationDto Location;
}
