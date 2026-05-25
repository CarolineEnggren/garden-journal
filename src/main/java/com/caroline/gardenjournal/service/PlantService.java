package com.caroline.gardenjournal.service;

import com.caroline.gardenjournal.dto.CreatePlantDto;
import com.caroline.gardenjournal.dto.PlantDto;
import com.caroline.gardenjournal.entity.Plant;
import com.caroline.gardenjournal.mapper.PlantMapper;
import com.caroline.gardenjournal.repository.PlantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service layer responsible for plant business logic.
 */
@Service
public class PlantService {

    private final PlantRepository plantRepository;

    private final PlantMapper plantMapper;

    public PlantService(
            PlantRepository plantRepository,
            PlantMapper plantMapper
    ) {
        this.plantRepository = plantRepository;
        this.plantMapper = plantMapper;
    }

    /**
     * Returns all plants from the database.
     */
    public List<PlantDto> getAllPlants() {

        List<Plant> plants = plantRepository.findAll();

        return plants.stream()
                .map(plantMapper::toDto)
                .toList();
    }

    /**
     * Creates and saves a new plant.
     */
    public PlantDto createPlant(CreatePlantDto dto) {

        // Convert incoming DTO to entity
        Plant plant = plantMapper.toEntity(dto);

        // Save entity in database
        Plant savedPlant = plantRepository.save(plant);

        // Convert saved entity back to DTO
        return plantMapper.toDto(savedPlant);
    }
}
