package com.caroline.gardenjournal.controller;

import com.caroline.gardenjournal.entity.Plant;
import com.caroline.gardenjournal.repository.PlantRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlantController {

    // Repository used to interact with the database
    private final PlantRepository plantRepository;

    public PlantController(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    // Returns all plants from the database
    @GetMapping("/plants")
    public List<Plant> getAllPlants() {
        return plantRepository.findAll();
    }

    // Creates and saves a new plant in the database
    @PostMapping("/plants")
    public Plant createPlant(@RequestBody Plant plant) {

        // Saves the plant object received from the request body
        return plantRepository.save(plant);
    }
}
