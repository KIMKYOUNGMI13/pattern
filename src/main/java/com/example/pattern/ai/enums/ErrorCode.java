package com.example.pattern.ai.enums;

import org.springframework.http.HttpStatus;

public enum ErrorCode {
    INVALID_MODEL_TYPE(HttpStatus.BAD_REQUEST, "Invalid model type"),
    ANALYSIS_FAILED(HttpStatus.INTERNAL_SERVER_ERROR, "Model analysis failed");

    private final HttpStatus status;
    private final String message;

    ErrorCode(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() { return status; }
    public String getMessage() { return message; }
}
