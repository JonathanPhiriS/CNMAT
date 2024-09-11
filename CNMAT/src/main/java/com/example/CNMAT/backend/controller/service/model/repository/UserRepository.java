package com.example.CNMAT.backend.controller.service.model.repository;

//package com.example.backend.repository;


import java.util.Optional;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    String toString();

    Optional<User> findByEmail(String email);

    static com.example.CNMAT.backend.service.model.User save(final com.example.CNMAT.backend.service.model.User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
}

