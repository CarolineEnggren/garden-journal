package com.caroline.gardenjournal.mapper;

import com.caroline.gardenjournal.dto.CreatePlantDto;
import com.caroline.gardenjournal.dto.PlantDto;
import com.caroline.gardenjournal.entity.Plant;
import org.springframework.stereotype.Component;

/**
 * Mapper responsible for converting
 * between Plant entities and DTOs.
 */
@Component
public class PlantMapper {

    /**
     * Converts a Plant entity to a PlantDto.
     */
    public PlantDto toDto(Plant plant) {

        PlantDto dto = new PlantDto();

        dto.setId(plant.getId());
        dto.setName(plant.getName());
        dto.setVariety(plant.getVariety());
        dto.setPlantedDate(plant.getPlantedDate());
        dto.setNotes(plant.getNotes());

        return dto;
    }

    /**
     * Converts CreatePlantDto to a Plant entity.
     */
    public Plant toEntity(CreatePlantDto dto) {

        Plant plant = new Plant();

        plant.setName(dto.getName());
        plant.setVariety(dto.getVariety());
        plant.setPlantedDate(dto.getPlantedDate());
        plant.setNotes(dto.getNotes());

        return plant;
    }
}
