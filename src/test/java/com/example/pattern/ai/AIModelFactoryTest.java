package com.example.pattern.ai;

import com.example.pattern.ai.factory.AIModelFactory;
import com.example.pattern.ai.factory.AnomalyDetectFactory;
import com.example.pattern.ai.factory.ObjectDetectFactory;
import com.example.pattern.ai.model.AIModel;
import com.example.pattern.ai.model.AnomalyDetectModel;
import com.example.pattern.ai.model.ObjectDetectModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for AIModelFactory implementations.
 */
public class AIModelFactoryTest {
    @Test
    void testAnomalyDetectModelFactory() {
        AIModelFactory factory = new AnomalyDetectFactory();
        AIModel model = factory.createModel();
        assertTrue(model instanceof AnomalyDetectModel);
    }

    @Test
    void testObjectDetectModelFactory() {
        AIModelFactory factory = new ObjectDetectFactory();
        AIModel model = factory.createModel();
        assertTrue(model instanceof ObjectDetectModel);
    }
}
