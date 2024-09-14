package org.example.service;

import org.example.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author dibyendu.debnath
 * @since 9/10/24
 */
@Repository
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public UserDto findUserByName(Integer id, String table) {
        String query = "select id, name, email from " + table + " where id = ?";

        return jdbcTemplate.queryForObject(query, new Object[]{id}, new UserRowMapper());
    }
}
