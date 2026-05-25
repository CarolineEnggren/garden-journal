package com.caroline.gardenjournal.dto;

import java.time.LocalDate;

/**
 * DTO used when creating a new plant.
 * This object represents data sent from the client.
 */
public class CreatePlantDto {

    private String name;

    private String variety;

    private LocalDate plantedDate;

    private String notes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public LocalDate getPlantedDate() {
        return plantedDate;
    }

    public void setPlantedDate(LocalDate plantedDate) {
        this.plantedDate = plantedDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
