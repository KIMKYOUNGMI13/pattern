package com.example.pattern.ai.factory;

import com.example.pattern.ai.model.AIModel;
import com.example.pattern.ai.model.ObjectDetectModel;

public class ObjectDetectFactory extends AIModelFactory{
    @Override
    public AIModel createModel() {
        return new ObjectDetectModel();
    }
}
