package com.example.pattern.ai.exception;

import com.example.pattern.ai.enums.ErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom exception for invalid model type requests.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidModelTypeException extends RuntimeException{
    private final ErrorCode errorCode;

    public InvalidModelTypeException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
