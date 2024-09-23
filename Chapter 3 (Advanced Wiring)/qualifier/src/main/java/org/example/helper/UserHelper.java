package org.example.helper;

import org.example.dto.UserDto;
import org.example.formatter.Formatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author dibyendu.debnath
 * @since 9/23/24
 */
@Component
public class UserHelper {

    @Autowired
    @Qualifier("userFormatter")
    private Formatter formattter;

    public void printFormattedUserName(UserDto userDto) {
        formattter.printFormattedName(userDto.getFirstName(), userDto.getLastName(), userDto.getTitle());
    }
}
