package com.example.gardenplanning.dao;

import com.example.gardenplanning.model.Plant;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlantRowMapper  implements RowMapper<Plant> {

    public Plant mapRow(ResultSet resultSet, int ignoreThis) throws SQLException {
        int id;
        String name;
        String startSeedlingsIndoor;
        String sowSeedsDirectly;
        String transplantIndoorSeedlings;
        String growingPeriod;
        String harvestPeriod;

        id = resultSet.getInt("id");
        name = resultSet.getString("name");
        startSeedlingsIndoor = resultSet.getString("startSeedlingsIndoor");
        sowSeedsDirectly = resultSet.getString("sowSeedsDirectly");
        transplantIndoorSeedlings = resultSet.getString("transplantIndoorSeedlings");
        growingPeriod = resultSet.getString("growingPeriod");
        harvestPeriod = resultSet.getString("harvestPeriod");


        return new Plant(id, name, startSeedlingsIndoor, sowSeedsDirectly, transplantIndoorSeedlings, growingPeriod, harvestPeriod);
    }
}
