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
@Table(name="Flights" , schema="sinan_air_company")
public class Flight {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String FlightNumber;
    @ManyToOne
    @JoinColumn(name = "OriginAirportId")
    private Airport OriginAirport;
    @ManyToOne
    @JoinColumn(name = "DestinationAirportId")
    private Airport DestinationAirport;
    @ManyToOne
    @JoinColumn(name = "AirCraftId")
    private AirCraft AirCraft;
    private Date DepartureTime;

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
