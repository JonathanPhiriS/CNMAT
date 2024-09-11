package com.example.CNMAT.backend.Controller.service;
package com.example.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CNMAT.backend.controller.service.model.repository.UserRepository;
import com.example.CNMAT.backend.service.model.User;
import java.util.Optional;

@Service
public class UserService {

    public UserService(com.example.backend.service.userRepository userRepository,
            BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = (UserRepository) userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Sign up user
    public User signUpUser(User user) {
        // Encrypt password before saving to DB-It encodes the password before saving it.
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return UserRepository.save(user);
    }

    // Sign in user
    public Optional<User> signInUser(String email, String rawPassword) {
        Optional<User> userOpt = Optional.empty();
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            // Check if password matches It checks if the provided password matches the encrypted one.
            if (passwordEncoder.matches(rawPassword, user.getPassword())) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
