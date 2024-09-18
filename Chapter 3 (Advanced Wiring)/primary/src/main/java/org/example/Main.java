package org.example;

import org.example.config.CarConfig;
import org.example.domain.CarOwner;
import org.example.domain.TeslaOwner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationApplicationContext = new AnnotationConfigApplicationContext(CarConfig.class);

        CarOwner carOwner = annotationApplicationContext.getBean(CarOwner.class);
        TeslaOwner teslaOwner = annotationApplicationContext.getBean(TeslaOwner.class);

        System.out.println(carOwner.getCar().displayCarName());
        System.out.println(carOwner.getTesla().displayCarName());
        System.out.println(teslaOwner.getTesla().displayCarName());
    }
}