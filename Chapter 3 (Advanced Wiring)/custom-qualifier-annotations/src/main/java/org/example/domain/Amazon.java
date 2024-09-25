package org.example.domain;

import org.example.annotation.BezosCompany;
import org.example.annotation.EcommerceSite;
import org.springframework.stereotype.Component;

/**
 * @author dibyendu.debnath
 * @since 9/25/24
 */
public class Amazon implements Company {

    @Override
    public String getCompanyName() {
        return "Amazon";
    }

    @Override
    public String getCompanyServiceType() {
        return "Ecommerce";
    }
}
