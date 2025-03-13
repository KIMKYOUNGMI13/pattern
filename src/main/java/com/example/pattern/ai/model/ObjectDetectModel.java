package com.example.pattern.ai.model;

import com.example.pattern.ai.enums.ErrorCode;
import com.example.pattern.ai.exception.ModelProcessingException;

public class ObjectDetectModel implements AIModel{

    @Override
    public boolean analyze() {
        System.out.println("Detecting objects in images...");

        if(1 != 1){
            throw new ModelProcessingException(ErrorCode.ANALYSIS_FAILED);
        }

        return true;
    }
}
