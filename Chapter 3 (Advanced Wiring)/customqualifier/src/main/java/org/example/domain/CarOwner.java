package org.example.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author dibyendu.debnath
 * @since 9/24/24
 */
@Component
public class CarOwner {

    @Autowired
    @Qualifier("Tesla")
    private Car teslaCar;

    @Autowired
    @Qualifier("TATA")
    private Car TataCar;

    @Autowired
    @Qualifier("SelfDrivingTesla")
    private Car SelfDrivingTeslaCar;

    public Car getTeslaCar() {
        return teslaCar;
    }

    public void setTeslaCar(Car teslaCar) {
        this.teslaCar = teslaCar;
    }

    public Car getTataCar() {
        return TataCar;
    }

    public void setTataCar(Car tataCar) {
        TataCar = tataCar;
    }

    public Car getSelfDrivingTeslaCar() {
        return SelfDrivingTeslaCar;
    }

    public void setSelfDrivingTeslaCar(Car selfDrivingTeslaCar) {
        SelfDrivingTeslaCar = selfDrivingTeslaCar;
    }
}
