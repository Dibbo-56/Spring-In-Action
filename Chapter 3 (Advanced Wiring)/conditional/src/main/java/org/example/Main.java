package org.example;

import org.example.config.SpringConfig;
import org.example.dto.UserDto;
import org.example.helper.UserHelper;
import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext annotationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = (UserService) annotationContext.getBean("userService");

        UserDto userDto = userService.findUserByName(1);

        System.out.println(userDto.getId());
        System.out.println(userDto.getName());
        System.out.println(userDto.getEmail());

        UserHelper userHelper = annotationContext.getBean(UserHelper.class);

        System.out.println(userHelper.getUserDtoString(userDto));
    }
}