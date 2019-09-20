package com.example.engineertestpranay;

import com.example.engineertestpranay.models.Hit;
import com.example.engineertestpranay.networkcalls.RetrofitCalls;

import java.util.List;

class MainViewInteractorImpl implements MainViewInteractor,OnResult {
    MainViewPresenter presenter;
    public MainViewInteractorImpl(MainViewPresenter mainViewPresenter) {
presenter=mainViewPresenter;
    }

    @Override
    public void onCreate( int val) {
        RetrofitCalls calls= new RetrofitCalls(this);
        calls.getPosts(val);
    }

    @Override
    public void setResult(List<Hit> hit) {
     presenter.setData(hit);
    }

    @Override
    public void getResult(List<Hit> hit) {
setResult(hit);
    }

    @Override
    public Void getFailure(String fail) {
        return null;
    }
}
