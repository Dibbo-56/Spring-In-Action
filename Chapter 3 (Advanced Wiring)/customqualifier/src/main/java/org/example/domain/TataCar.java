package org.example.domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author dibyendu.debnath
 * @since 9/24/24
 */
@Component
@Qualifier("TATA")
public class TataCar implements Car{

    @Override
    public String getCarTypeName() {
        return "TATA Car";
    }
}
