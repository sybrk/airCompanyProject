package com.example.airCompany.repository;

import com.example.airCompany.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAirportRepository extends JpaRepository<Airport, Integer> {
}
