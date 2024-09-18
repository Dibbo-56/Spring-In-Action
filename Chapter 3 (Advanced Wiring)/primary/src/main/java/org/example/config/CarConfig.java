package org.example.config;

import org.example.domain.Car;
import org.example.domain.Tata;
import org.example.domain.Tesla;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author dibyendu.debnath
 * @since 9/18/24
 */

@Configuration
@ComponentScan("org.example")
public class CarConfig {

    @Bean
    @Primary
    public Car car() {
        return new Tata("TATA");
    }

    @Bean
    public Tesla tesla() {
        return new Tesla("Tesla");
    }
}
