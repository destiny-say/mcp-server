package com.mcp.server.config;

import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.function.FunctionToolCallback;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mcp.server.service.DateTimeService;

@Configuration
public class McpWebFluxServiceExampleConfig {

    @Bean
    public ToolCallbackProvider dateTimeTools(DateTimeService dateTimeService) {
        return MethodToolCallbackProvider.builder().toolObjects(dateTimeService).build();
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
