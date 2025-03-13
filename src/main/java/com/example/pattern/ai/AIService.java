package com.example.pattern.ai;


import com.example.pattern.ai.dto.AIModelResponse;
import com.example.pattern.ai.exception.ModelProcessingException;
import com.example.pattern.ai.factory.AIModelFactory;
import com.example.pattern.ai.model.AIModel;
import org.springframework.stereotype.Service;

@Service
public class AIService {
    /**
     * Processes an AI model using the given factory.
     *
     * @param factory The factory to create the AI model.
     * @return The response indicating success or failure.
     */
    public AIModelResponse processModel(AIModelFactory factory){
        AIModel model = factory.createModel();

        try{
            boolean success = model.analyze();
            return new AIModelResponse(success, success ? "Success" : "Fail");
        } catch (ModelProcessingException e) {
            return new AIModelResponse(false, e.getErrorCode().getMessage());
        }

    }
}
