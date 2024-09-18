package org.example.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dibyendu.debnath
 * @since 9/18/24
 */
@Component
public class TeslaOwner {

    @Autowired
    private Tesla tesla;

    public Tesla getTesla() {
        return tesla;
    }

    public void setTesla(Tesla tesla) {
        this.tesla = tesla;
    }
}
