package com.example.pattern.ai.factory;

import com.example.pattern.ai.model.AIModel;
import com.example.pattern.ai.model.AnomalyDetectModel;

public class AnomalyDetectFactory extends AIModelFactory{
    @Override
    public AIModel createModel() {
        return new AnomalyDetectModel();
    }
}
