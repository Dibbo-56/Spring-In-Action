package org.example.config;

import org.example.annotation.BezosCompany;
import org.example.annotation.EcommerceSite;
import org.example.annotation.RocketCompany;
import org.example.domain.Amazon;
import org.example.domain.BlueOrigin;
import org.example.domain.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author dibyendu.debnath
 * @since 9/25/24
 */
@Configuration
@ComponentScan("org.example")
@ImportResource("META-INF/applicationContext.xml")
public class SpringConfig {

    @Bean
    @BezosCompany
    @EcommerceSite
    public Company amazon() {
        return new Amazon();
    }

    @Bean
    @BezosCompany
    @RocketCompany
    public Company blueOrigin() {
        return new BlueOrigin();
    }
}
