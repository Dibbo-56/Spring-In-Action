package org.example.service;

import org.example.condition.UserExistCondition;
import org.example.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author dibyendu.debnath
 * @since 9/10/24
 */
@Repository
@Conditional({UserExistCondition.class})
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public UserDto findUserByName(Integer id) {
        String query = "select id, name, email from dev_users where id = ?";

        return jdbcTemplate.queryForObject(query, new UserRowMapper(), id);
    }
}
