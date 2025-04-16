package com.mcp.server.config;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mcp.server.service.DateTimeService;
import com.mcp.server.service.OpenMeteoService;

@Configuration
public class McpWebFluxServiceExampleConfig {

    @Bean
    public ToolCallbackProvider dateTimeTools(DateTimeService dateTimeService, 
    		OpenMeteoService openMeteoService) {
        return MethodToolCallbackProvider.builder().toolObjects(dateTimeService, openMeteoService).build();
    }
    

    // public record TextInput(String input) {
    // }

    // @Bean
    // public ToolCallback toUpperCase() {
    // return FunctionToolCallback.builder("toUpperCase", (TextInput input) ->
    // input.input().toUpperCase())
    // .inputType(TextInput.class)
    // .description("Put the text to upper case")
    // .build();
    // }
}
