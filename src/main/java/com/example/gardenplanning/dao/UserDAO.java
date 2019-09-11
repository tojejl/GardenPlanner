package com.example.gardenplanning.dao;


import com.example.gardenplanning.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> getAll() {

        return jdbcTemplate.query("SELECT * FROM garden.user",
                new UserRowMapper()); }

    public void addUser(User user) {

        //Checks to see if USERNAME Exists
        try {
            jdbcTemplate.queryForObject("SELECT email FROM garden.user WHERE username = ?",
                    new Object[]{user.getUsername()}, String.class);
        } catch (EmptyResultDataAccessException ex) {

            jdbcTemplate.update("INSERT INTO garden.user(username, firstname, lastname, email, password)" +
                            " VALUES (?,?,?,?,?)",
                    user.getUsername(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
        }
    }


    public User findById(int id) {
        List<User> matches = jdbcTemplate.query(
                "SELECT * FROM garden.user WHERE id=?",
                new Object[] { id },
                new UserRowMapper());
        if(matches.isEmpty()) {
            return null;
        }
        else {
            return matches.get(0);
        }
    }

    public String userLogin(String username, String password) {
        try {
            jdbcTemplate.queryForObject(
                    "SELECT * FROM garden.user WHERE username=? AND password=?",
                     new Object[] {username, password}, new UserRowMapper());
        }
        catch (EmptyResultDataAccessException ex) {
            return "userLogin";
        }

        return "index";
    }

}


