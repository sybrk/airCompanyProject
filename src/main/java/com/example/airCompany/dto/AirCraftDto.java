package com.example.airCompany.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class AirCraftDto {

    private String name;
    private Date purchaseDate;
    private Integer ecoCapacity;
    private Integer businessCapacity;
}
