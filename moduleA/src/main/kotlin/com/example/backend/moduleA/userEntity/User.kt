package com.example.backend.moduleA.userEntity

import jakarta.persistence.*

@Entity
@Table(name = "users")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        @Column(unique = true, nullable = false)
        val username: String,

        @Column(nullable = false)
        val password: String
)