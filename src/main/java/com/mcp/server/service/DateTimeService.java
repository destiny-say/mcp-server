package com.mcp.server.service;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class DateTimeService {

    @Tool(description = "外部获取当前时间")
    public String getCurrentDateTime() {
        System.out.println("进入工具");
        return LocalDateTime.now().atZone(ZoneId.systemDefault()).toString();
    }

}
