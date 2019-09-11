package com.example.gardenplanning.dao;

import com.example.gardenplanning.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper {

    public User mapRow(ResultSet resultSet, int unused) throws SQLException {
        int id = resultSet.getInt("id");
        String username = resultSet.getString("username");
        String firstName = resultSet.getString("firstname");
        String lastName = resultSet.getString("lastname");
        String email = resultSet.getString("email");
        String password = resultSet.getString("password");

        return new User(id, username, firstName, lastName, email, password);
    }
}
