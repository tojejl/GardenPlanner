package com.example.gardenplanning.dao;

import com.example.gardenplanning.model.Plant;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlantRowMapper  implements RowMapper<Plant> {

    public Plant mapRow(ResultSet resultSet, int ignoreThis) throws SQLException {
        int id;
        String name;

        id = resultSet.getInt("id");
        name = resultSet.getString("name");

        return new Plant(id, name);
    }
}
