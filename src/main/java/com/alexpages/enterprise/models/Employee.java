package com.alexpages.enterprise.models;

import jakarta.persistence.Entity;

@Entity
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
}
