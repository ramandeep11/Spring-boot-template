package com.example.backend.moduleA.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@Configuration
class PasswordEncoder {

    fun passwordEncoder(): BCryptPasswordEncoder = BCryptPasswordEncoder()

}