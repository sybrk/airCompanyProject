package com.example.airCompany.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
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

    @Column(name = "IsDeleted", columnDefinition = "boolean default false")
    private Boolean IsDeleted;

    @Column(name = "CreatedAt", updatable = false)
    @CreationTimestamp
    private Date CreatedAt;

    @Column(name = "LastModifiedAt")
    @CurrentTimestamp
    private Date LastModifiedAt;
}
