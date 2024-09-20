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
@Table(name="Airports" , schema="sinan_air_company")
public class Airport {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String AirportName;
    private String AirportCode;
    @ManyToOne
    @JoinColumn(name = "LocationId")
    private Location LocationId;

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
