package com.example.pattern.ai;

import com.example.pattern.ai.enums.ErrorCode;
import com.example.pattern.ai.exception.InvalidModelTypeException;
import com.example.pattern.ai.exception.ModelProcessingException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for AIModel-related exception handling.
 */
public class AIExceptionTest {
    @Test
    void testModelProcessingException() {
        Exception exception = assertThrows(ModelProcessingException.class, () -> {
            throw new ModelProcessingException(ErrorCode.ANALYSIS_FAILED);
        });

        assertEquals("Model analysis failed", exception.getMessage());
    }

    @Test
    void testInvalidModelTypeException() {
        Exception exception = assertThrows(InvalidModelTypeException.class, () -> {
            throw new InvalidModelTypeException(ErrorCode.INVALID_MODEL_TYPE);
        });

        assertEquals("Invalid model type", exception.getMessage());
    }
}
