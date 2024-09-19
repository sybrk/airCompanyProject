package com.example.airCompany.repository;

import com.example.airCompany.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILocationRepository extends JpaRepository<Location, Integer> {

}
