package com.example.pattern.ai.exception;

import com.example.pattern.ai.dto.AIModelResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ModelProcessingException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public AIModelResponse handleModelProcessingException(ModelProcessingException e) {
        return new AIModelResponse(false, e.getErrorCode().getMessage());
    }

    @ExceptionHandler(InvalidModelTypeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public AIModelResponse handleInvalidModelTypeException(InvalidModelTypeException e) {
        return new AIModelResponse(false, e.getErrorCode().getMessage());
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public AIModelResponse handleEnumTypeMismatchException(MethodArgumentTypeMismatchException e) {
        return new AIModelResponse(false, "Invalid model type: " + e.getValue());
    }
}
