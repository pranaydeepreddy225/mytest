package com.example.engineertestpranay;

import com.example.engineertestpranay.models.Hit;

import java.util.List;

public interface OnResult {
    void getResult(List<Hit> hit);
    Void getFailure(String fail);
}
