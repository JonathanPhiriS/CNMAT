package com.example.CNMAT.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    // Sign up new user
    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody User user) {
        User newUser = UserService.signUpUser(user);
        return ResponseEntity.ok(newUser);
    }

    // Sign in user
    @PostMapping("/signin")
    public ResponseEntity<?> signIn(@RequestParam String email, @RequestParam String password) {
        Optional<User> user = userService.signInUser(email, password);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        }
        return ResponseEntity.status(401).body("Invalid credentials");
    }
}
