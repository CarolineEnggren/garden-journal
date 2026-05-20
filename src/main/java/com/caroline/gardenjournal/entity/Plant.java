package com.caroline.gardenjournal.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

// Represents a plant in the garden journal application
@Entity
@Table(name = "plants")
@Getter
@Setter
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String variety;

    private LocalDate plantedDate;

    private String notes;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}