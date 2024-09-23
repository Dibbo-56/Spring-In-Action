package org.example.service;

import org.example.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author dibyendu.debnath
 * @since 9/23/24
 */
@Repository
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public UserDto findUserById(Integer id) {
        String query = "select id, first_name, last_name, title from users where id = ?";

        return jdbcTemplate.queryForObject(query, new UserRowMapper(), id);
    }
}
