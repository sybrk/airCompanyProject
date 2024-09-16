package com.example.airCompany.repository;

import com.example.airCompany.entity.AirCraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAirCraftRepository extends JpaRepository<AirCraft, Integer> {
}
