package org.example.formatter;

import org.springframework.stereotype.Component;

/**
 * @author dibyendu.debnath
 * @since 9/23/24
 */
@Component
public class AdminFormatter implements Formatter{

    @Override
    public void printFormattedName(String firstName, String lastName, String title) {
        System.out.println("Admin First Name " + firstName);
        System.out.println("Admin Last Name " + lastName);
        System.out.println("Admin Title " + title);
    }
}
