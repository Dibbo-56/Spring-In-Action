package org.example.domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author dibyendu.debnath
 * @since 9/24/24
 */
@Component
@Qualifier("SelfDrivingTesla")
public class SelfDrivingTeslaCar implements Car{

    @Override
    public String getCarTypeName() {
        return "Self Driving Tesla";
    }
}
