package org.example.service;

import org.example.dto.UserDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author dibyendu.debnath
 * @since 9/14/24
 */
public class UserRowMapper implements RowMapper<UserDto> {

    @Override
    public UserDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserDto userDto = new UserDto();

        userDto.setId(rs.getInt("id"));
        userDto.setName(rs.getString("name"));
        userDto.setEmail(rs.getString("email"));

        return userDto;
    }
}
