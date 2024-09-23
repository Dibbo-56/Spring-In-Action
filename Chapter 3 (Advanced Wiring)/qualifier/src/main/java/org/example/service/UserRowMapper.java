package org.example.service;

import org.example.dto.UserDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author dibyendu.debnath
 * @since 9/23/24
 */
public class UserRowMapper implements RowMapper<UserDto> {

    @Override
    public UserDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserDto userDto = new UserDto();

        userDto.setId(rs.getInt("id"));
        userDto.setFirstName(rs.getString("first_name"));
        userDto.setLastName(rs.getString("last_name"));
        userDto.setTitle(rs.getString("title"));

        return userDto;
    }
}
