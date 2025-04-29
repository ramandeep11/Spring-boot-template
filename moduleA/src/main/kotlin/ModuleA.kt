package com.example.backend.moduleA

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class ModuleA

fun main(args: Array<String>){
    runApplication<ModuleA>(*args)
}