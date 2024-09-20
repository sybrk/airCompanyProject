package com.example.airCompany.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Locations")
@Table(name="Locations" , schema="sinan_air_company")
public class Location {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "LocationName")
    private String LocationName;

    @Column(name = "Country")
    private String Country;

    @Column(name = "City")
    private String City;

    @Column(name = "Status")
    private String Status;

    @Column(name = "IsDeleted")
    private Boolean IsDeleted = false;

    @Column(name = "CreatedAt", updatable = false)
    @CreationTimestamp
    private Date CreatedAt;

    @Column(name = "LastModifiedAt")
    @CurrentTimestamp
    private Date LastModifiedAt;
}
