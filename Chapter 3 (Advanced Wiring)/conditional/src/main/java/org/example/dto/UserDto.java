package org.example.dto;

import java.io.Serializable;

/**
 * @author dibyendu.debnath
 * @since 9/14/24
 */
public class UserDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
