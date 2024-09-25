package org.example.domain;

import org.example.annotation.BezosCompany;
import org.example.annotation.RocketCompany;
import org.springframework.stereotype.Component;

/**
 * @author dibyendu.debnath
 * @since 9/25/24
 */
public class BlueOrigin implements Company{

    @Override
    public String getCompanyName() {
        return "Blue Origin";
    }

    @Override
    public String getCompanyServiceType() {
        return "Rocket Service";
    }
}
