package org.example.domain;

/**
 * @author dibyendu.debnath
 * @since 9/18/24
 */
public class Tesla implements Car {

    private String carBrand;

    public Tesla(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public String getCarBrand() {
        return carBrand;
    }

    @Override
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public String displayCarName() {
        return "The Car Brand is " + getCarBrand();
    }
}
