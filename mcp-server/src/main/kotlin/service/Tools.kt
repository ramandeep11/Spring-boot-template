package com.backend.service

import org.springframework.ai.tool.annotation.Tool
import org.springframework.ai.tool.annotation.ToolParam

class Tools {
    @Tool(description = "List something",name = "raman's tool for AI to use")
    fun listPosts(): List<String> {
        return listOf("this is a sample response from a tool", "just adding some more response")
    }

    @Tool(description = "return something with ID", name = "raman's second tool")
    fun particularTool(@ToolParam(required = true, description = "Id for the tool to call") id : String): String {
        return "This is the response for this id: $id";
    }
}