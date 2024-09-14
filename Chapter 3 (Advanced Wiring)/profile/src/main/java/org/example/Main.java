package org.example;

import org.example.config.SpringConfig;
import org.example.dto.UserDto;
import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

public class Main {
    public static void main(String[] args) {

        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "Dev");
        ApplicationContext annotationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = annotationContext.getBean(UserService.class);

        UserDto userDto = userService.findUserByName(1, "dev_users");

        System.out.println(userDto.getId());
        System.out.println(userDto.getName());
        System.out.println(userDto.getEmail());

        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");

        UserDto devUserDto = (UserDto) xmlApplicationContext.getBean("devUser");
        System.out.println(devUserDto.getId());
        System.out.println(devUserDto.getName());
        System.out.println(devUserDto.getEmail());
    }
}