package com.example.application.data.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;

@Entity
public class User1 extends AbstractEntity {

    private String login;
    @Email
    private String email;
    private String role;

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

}
