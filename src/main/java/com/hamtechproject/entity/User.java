package com.hamtechproject.entity;

import com.hamtechproject.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Assuming 'id' is the primary key

    private String name; // Corrected mapping for 'name' attribute

    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    // Getters and setters (or lombok annotations) for other attributes
}
