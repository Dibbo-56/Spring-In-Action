package org.example.formatter;

import org.springframework.stereotype.Component;

/**
 * @author dibyendu.debnath
 * @since 9/23/24
 */
@Component
public class UserFormatter implements Formatter {

    @Override
    public void printFormattedName(String firstName, String lastName, String title) {
        System.out.println("User First Name " + firstName);
        System.out.println("User Last Name " + lastName);
        System.out.println("User Title " + title);
    }
}
