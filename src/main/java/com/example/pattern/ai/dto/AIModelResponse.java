package com.example.pattern.ai.dto;

import lombok.Getter;

@Getter
public class AIModelResponse {
    private boolean success;
    private String message;

    public AIModelResponse(boolean success, String message){
        this.success = success;
        this.message = message;
    }
}
