package com.example.gardenplanning.dao;

import com.example.gardenplanning.model.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlantDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Plant> getAll() {

        return jdbcTemplate.query("select * from garden.plants",
                new PlantRowMapper());
    }

    public void addPlant(Plant plant) {
        System.out.println("Inserting " + plant);
        jdbcTemplate.update(
                "INSERT INTO garden.plants(plantName, startSeedlingsIndoor, sowSeedsDirectly, transplantIndoorSeedlings, " +
                        "growingPeriod, harvestPeriod, plantNotes, keyword) VALUES (?,?,?,?,?,?,?,?)",
                plant.getPlantName(), plant.getStartSeedlingsIndoor(), plant.getSowSeedsDirectly(),
                plant.getTransplantIndoorSeedlings(), plant.getGrowingPeriod(), plant.getHarvestPeriod(), plant.getPlantNotes(), plant.getKeyword());
    }

    public void updatePlant(int id, Plant plant) {
        System.out.println("Updating " + plant);
        jdbcTemplate.update(
                "UPDATE garden.plants SET plantName=?, startSeedlingsIndoor=?, sowSeedsDirectly=?, transplantIndoorSeedlings=?, growingPeriod=?, harvestPeriod=?, plantNotes=?, keyword=? where id=?",
                plant.getPlantName(), plant.getStartSeedlingsIndoor(), plant.getSowSeedsDirectly(),
                plant.getTransplantIndoorSeedlings(), plant.getGrowingPeriod(), plant.getHarvestPeriod(), plant.getPlantNotes(), plant.getKeyword(), id);
    }

    public Plant findById(int id) {
        List<Plant> matches = jdbcTemplate.query(
                "SELECT * from garden.plants where id = ?",
                new Object[] { id },
                new PlantRowMapper());
        if(matches.isEmpty()){
            return null;
        }
       else{
           return matches.get(0);
        }
    }
}
