package com.example.engineertestpranay;

import com.example.engineertestpranay.models.Hit;

import java.util.List;

public interface MainViewInteractor {
    void onCreate( int val);
   void setResult(List<Hit> hit);
}
