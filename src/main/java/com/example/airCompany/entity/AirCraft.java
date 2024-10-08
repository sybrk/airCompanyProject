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
@Entity(name="air_crafts")
@Table(name="air_crafts" , schema="sinan_air_company")
public class AirCraft {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "purchase_date")
    private Date purchaseDate;
    @Column(name = "eco_capacity")
    private int ecoCapacity;
    @Column(name = "business_capacity")
    private int businessCapacity;
    @Column(name = "status")
    private String status;
    @Column(name = "is_deleted", nullable = true)
    private Boolean isDeleted;
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private Date createdAt;
    @CurrentTimestamp
    @Column(name = "last_modified_at")
    private Date lastModifiedAt;
}
