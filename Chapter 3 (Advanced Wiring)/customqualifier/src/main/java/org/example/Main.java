package org.example;

import org.example.config.SpringConfig;
import org.example.domain.CarOwner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        CarOwner carOwner = applicationContext.getBean(CarOwner.class);

        System.out.println("###################################");
        System.out.println(carOwner.getTataCar().getCarTypeName());

        System.out.println("###################################");
        System.out.println(carOwner.getTeslaCar().getCarTypeName());

        System.out.println("###################################");
        System.out.println(carOwner.getSelfDrivingTeslaCar().getCarTypeName());
    }
}