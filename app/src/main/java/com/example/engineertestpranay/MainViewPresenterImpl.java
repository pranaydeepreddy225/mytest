package com.example.engineertestpranay;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.example.engineertestpranay.models.Hit;

import java.util.List;

class MainViewPresenterImpl implements MainViewPresenter {
    TitleAdapter mRecycler;
    MainViewInteractor mainViewInteractor;
    public MainViewPresenterImpl(Context applicationContext) {

    }

    @Override
    public void onCreate(TitleAdapter recyclerView, MainView view) {
        mRecycler=recyclerView;
        mainViewInteractor=new MainViewInteractorImpl(this);
        mainViewInteractor.onCreate(1);

    }

    @Override
    public void setData(List<Hit> data) {
        mRecycler.setData(data);
    }
}
