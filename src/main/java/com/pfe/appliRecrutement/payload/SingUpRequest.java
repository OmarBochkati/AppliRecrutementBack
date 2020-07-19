package com.pfe.appliRecrutement.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SingUpRequest {

	@NotBlank
    @Size(min = 4, max = 40)
    private String firstname;

	@NotBlank
    @Size(min = 4, max = 40)
    private String lastname;

    @NotBlank
    @Size(min = 3, max = 15)
    private String username;

    @NotBlank
    @Size(min = 6, max = 20)
    private String password;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String name) {
        this.lastname = name;
    }

    public String getFisrtname() {
        return firstname;
    }

    public void setfirstname(String name) {
        this.firstname = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
