package com.example.pattern.ai;

import com.example.pattern.ai.dto.AIModelResponse;
import com.example.pattern.ai.factory.AnomalyDetectFactory;
import com.example.pattern.ai.factory.ObjectDetectFactory;
import com.example.pattern.ai.model.AnomalyDetectModel;
import com.example.pattern.ai.model.ObjectDetectModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.when;

/**
 * Unit tests for AIModelService using Mockito.
 */
@ExtendWith(MockitoExtension.class)
public class AIServiceTest {
    @InjectMocks
    private AIService service;

    @Mock
    private AnomalyDetectFactory anomalyDetectModelFactory;

    @Mock
    private ObjectDetectFactory objectDetectModelFactory;

    @Test
    void testProcessAnomalyModelSuccess() {
        given(anomalyDetectModelFactory.createModel()).willReturn(new AnomalyDetectModel());
        AIModelResponse response = service.processModel(anomalyDetectModelFactory);
        assertTrue(response.isSuccess());
        then(anomalyDetectModelFactory).should().createModel();
    }

    @Test
    void testProcessObjectModelSuccess() {
        given(objectDetectModelFactory.createModel()).willReturn(new ObjectDetectModel());
        AIModelResponse response = service.processModel(objectDetectModelFactory);
        assertTrue(response.isSuccess());
        then(objectDetectModelFactory).should().createModel();
    }
}
