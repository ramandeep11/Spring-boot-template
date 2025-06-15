package com.example.backend.moduleA.service

import com.example.backend.moduleA.config.PasswordEncoder
import com.example.backend.moduleA.repository.UserRepository
import com.example.backend.moduleA.userEntity.User
import org.springframework.stereotype.Service

@Service
class MyService(
        private val passwordEncoder: PasswordEncoder,
        private val userRepository: UserRepository
) {
    fun registerUser(username: String, password: String) : String {
        val user = userRepository.findByUsername(username)
        if(user==null){
            val hashedPassword = passwordEncoder.passwordEncoder().encode(password)
            val userEntity = User(username = username, password = hashedPassword)
            userRepository.save(userEntity)
            return "registered successfully"
        }else{

//            throw exception that user is registered
            return "already registered for this user"

        }
    }

    fun authenticate(username: String, password: String) : Boolean {
        val user = userRepository.findByUsername(username) ?: return false

        return passwordEncoder.passwordEncoder().matches(password,user.password)

    }
}