package com.example.airCompany.service.entityManager.implementation;

import com.example.airCompany.dto.AirCraftDto;
import com.example.airCompany.entity.AirCraft;
import com.example.airCompany.mapper.AirCraftMapper;
import com.example.airCompany.service.entityManager.IAirCraftRepositoryManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class AirCraftRepositoryManagerImpl implements IAirCraftRepositoryManager {

    EntityManager entityManager;

    @Autowired
    public AirCraftRepositoryManagerImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<AirCraftDto> getAll() {

        // below is not sql but it is like hibernate query language.
        //TypedQuery<AirCraft> airCraftsList = entityManager.createQuery("select a from air_crafts a", AirCraft.class);

        // this one is native SQL. This way we can reduce the size of the table for entity.
        // for example this way deleted aircrafts will not come to entity.
        Query nativeQuery = entityManager.createNativeQuery("SELECT * FROM sinan_air_company.air_crafts WHERE is_deleted=false;", AirCraft.class);
        //List<AirCraft> resultList = nativeQuery.getResultList();
        List<AirCraft> resultList = nativeQuery.getResultList();
        List<AirCraftDto> result = new ArrayList<>();
        for (int i = 0; i < resultList.size(); i++) {

            result.add(AirCraftMapper.AirCraftEntityToDtoMapper(resultList.get(i)));
        }
        //return airCraftsList.getResultList();
        return result;
    }
}
