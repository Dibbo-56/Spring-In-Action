package org.example.helper;

import org.example.annotation.ConditionalTestAnnotation;
import org.example.condition.AnnotationCheckCondition;
import org.example.dto.UserDto;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @author dibyendu.debnath
 * @since 9/16/24
 */
@Component
@ConditionalTestAnnotation(create = "yes")
@Conditional(AnnotationCheckCondition.class)
public class UserHelper {

    public UserDto getUserDto() {
        return new UserDto();
    }

    public String getUserDtoString(UserDto userDto) {
        return userDto.getId() + " " + userDto.getName() + " " + userDto.getEmail();
    }
}
