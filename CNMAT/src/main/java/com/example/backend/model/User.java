package com.example.CNMAT.backend.service.model; // Use the correct package structure

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.annotation.Generated;
import jakarta.persistence.GeneratedValue;
import javax.persistence.GenerationType;


// Remove this duplicate package declaration
// package com.example.backend.model;



@EntityScan
public class User {

   // private static final String GenerationType = null;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Uses IDENTITY strategy for auto-incrementing the ID
    //@Generated(comments = GenerationType.IDENTITY, value = { "" })
    private Long id;
    
    private String username;
    private String password;
    private String email;
    private String provider;  // "google", "apple" or "local" for normal login

    // Default constructor
    public User() {}

    // Constructor with all fields
    public User(String username, String password, String email, String provider) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.provider = provider;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
