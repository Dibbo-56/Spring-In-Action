package org.example.domain;

/**
 * @author dibyendu.debnath
 * @since 9/25/24
 */
public class Tesla implements Company{

    @Override
    public String getCompanyName() {
        return "Tesla";
    }

    @Override
    public String getCompanyServiceType() {
        return "Electric Vehicle";
    }
}
