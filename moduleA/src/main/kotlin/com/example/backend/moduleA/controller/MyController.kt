package com.example.backend.moduleA.controller

import com.example.backend.moduleA.com.example.backend.moduleA.dto.response.LoginResponse
import com.example.backend.moduleA.dto.request.RegisterRequest
import com.example.backend.moduleA.dto.response.RegisterResponse
import com.example.backend.moduleA.service.MyService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController(
        private val service: MyService
) {
    @PostMapping("/v1/register")
    fun registerUser(
            @RequestBody request: RegisterRequest
    ) : ResponseEntity<RegisterResponse> {
        val response =  RegisterResponse(message = service.registerUser(request.username,request.password))

        return ResponseEntity(response, HttpStatus.OK)
    }

    @GetMapping("/test")
    fun getTest() : String {
        return "test"
    }

//    @PostMapping("/v1/login")
//    fun login(
//            @RequestBody login: RegisterRequest
//    ): ResponseEntity<LoginResponse> {
//
//    }
}