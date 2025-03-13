package com.example.pattern.ai;

import com.example.pattern.ai.dto.AIModelResponse;
import com.example.pattern.ai.enums.AIModelType;
import com.example.pattern.ai.enums.ErrorCode;
import com.example.pattern.ai.exception.InvalidModelTypeException;
import com.example.pattern.ai.factory.AIModelFactory;
import com.example.pattern.ai.factory.AnomalyDetectFactory;
import com.example.pattern.ai.factory.ObjectDetectFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/models/v1")
public class AIController {
    private final AIService service;

    public AIController(AIService service){
        this.service = service;
    }

    /**
     * Processes an AI model request.
     *
     * @param modelType The type of AI model to process.
     * @return The result of the processing.
     */
    @PostMapping("/analyze")
    public AIModelResponse analyzeModel(@RequestParam(value = "type") AIModelType modelType){
        AIModelFactory factory;
        switch (modelType){
            case ANOMALY -> factory = new AnomalyDetectFactory();
            case OBJECT -> factory = new ObjectDetectFactory();
            default -> {
                throw new InvalidModelTypeException(ErrorCode.INVALID_MODEL_TYPE);
            }
        }

        return service.processModel(factory);
    }
}
