package com.creating_contract.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "users_contracts")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;

}
