package com.example.gardenplanning.dao;

import com.example.gardenplanning.model.Plant;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlantRowMapper  implements RowMapper<Plant> {

    public Plant mapRow(ResultSet resultSet, int ignoreThis) throws SQLException {

        int id = resultSet.getInt("id");
        String plantName = resultSet.getString("plantName");
        String startSeedlingsIndoor = resultSet.getString("startSeedlingsIndoor");
        String sowSeedsDirectly = resultSet.getString("sowSeedsDirectly");
        String transplantIndoorSeedlings = resultSet.getString("transplantIndoorSeedlings");
        String growingPeriod = resultSet.getString("growingPeriod");
        String  harvestPeriod = resultSet.getString("harvestPeriod");
        String plantNotes = resultSet.getString("plantNotes");
        String keyword = resultSet.getString("keyword");


        return new Plant(id, plantName, startSeedlingsIndoor, sowSeedsDirectly, transplantIndoorSeedlings, growingPeriod, harvestPeriod, plantNotes, keyword);
    }
}
