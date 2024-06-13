package com.anujmehla.My.Story.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(nullable = false, length = 60)
    private String passwordHash;

    @Column(length = 50)
    private String firstName;

    @Column(length = 50)
    private String lastName;

    @Column
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @Column
    private LocalDateTime lastLogin;

    @Column(nullable = false, length = 10)
    private String status;

    @Column(nullable = false, length = 10)
    private String role;

    // Constructors, Getters, and Setters
}
