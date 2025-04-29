package com.example.backend.moduleA.repository

import com.example.backend.moduleA.userEntity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    fun findByUsername(username: String) : User?
}