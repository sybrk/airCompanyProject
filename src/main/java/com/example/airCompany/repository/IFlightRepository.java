package com.example.airCompany.repository;

import com.example.airCompany.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFlightRepository extends JpaRepository<Flight, Integer> {
}
