package com.caroline.gardenjournal.repository;

import com.caroline.gardenjournal.entity.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepository extends JpaRepository<Plant, Long> {
}