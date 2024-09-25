package org.example;

import org.example.config.SpringConfig;
import org.example.service.CompanyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        CompanyService companyService = applicationContext.getBean(CompanyService.class);
        companyService.printCompanyNamesAndServices();
    }
}