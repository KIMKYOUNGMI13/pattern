package com.example.pattern.ai.exception;

import com.example.pattern.ai.enums.ErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom exception for handling AI model processing errors.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ModelProcessingException extends RuntimeException{
    private final ErrorCode errorCode;

    public ModelProcessingException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }
}
