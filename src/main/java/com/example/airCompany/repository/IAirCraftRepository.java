package com.example.airCompany.repository;

import com.example.airCompany.entity.AirCraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAirCraftRepository extends JpaRepository<AirCraft, Integer> {
//    @Query("select a from air_crafts a")
//    List<AirCraft> getData();
//
//    @Query("select a from air_crafts a where id=:id")
//    List<AirCraft> getDataById(Integer id);
}

