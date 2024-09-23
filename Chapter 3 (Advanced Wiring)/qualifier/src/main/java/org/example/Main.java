package org.example;

import org.example.config.SpringConfig;
import org.example.dto.UserDto;
import org.example.helper.UserHelper;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = applicationContext.getBean(UserService.class);
        UserHelper userHelper = applicationContext.getBean(UserHelper.class);

        UserDto userDto = userService.findUserById(2);
        userHelper.printFormattedUserName(userDto);
    }
}