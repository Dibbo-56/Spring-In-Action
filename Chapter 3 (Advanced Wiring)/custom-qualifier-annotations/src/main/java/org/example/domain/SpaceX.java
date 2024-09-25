package org.example.domain;

/**
 * @author dibyendu.debnath
 * @since 9/25/24
 */
public class SpaceX implements Company{

    @Override
    public String getCompanyName() {
        return "SpaceX";
    }

    @Override
    public String getCompanyServiceType() {
        return "Reusable Rocket Service";
    }
}
