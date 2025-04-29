package com.example.backend.moduleA.com.example.backend.moduleA.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfig {

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http
                .csrf { it.disable() }
                .authorizeHttpRequests {
                    it.requestMatchers("/v1/register", "/test").permitAll()  // <-- allow register and test
                            .anyRequest().authenticated()
                }
                .httpBasic {} // Enable basic auth for others
        return http.build()
    }
}