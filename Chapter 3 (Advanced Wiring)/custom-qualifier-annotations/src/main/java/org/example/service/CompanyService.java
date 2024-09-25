package org.example.service;

import org.example.annotation.CarCompany;
import org.example.annotation.ElonMuskCompany;
import org.example.annotation.RocketCompany;
import org.example.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dibyendu.debnath
 * @since 9/25/24
 */
@Component
public class CompanyService {

    @Autowired
    @ElonMuskCompany
    @RocketCompany
    private Company spaceX;

    @Autowired
    @ElonMuskCompany
    @CarCompany
    private Company tesla;

    public void printCompanyNamesAndServices() {
        System.out.println(spaceX.getCompanyName());
        System.out.println(spaceX.getCompanyServiceType());
        System.out.println();
        System.out.println(tesla.getCompanyName());
        System.out.println(tesla.getCompanyServiceType());
    }
}
