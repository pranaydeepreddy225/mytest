package com.example.engineertestpranay;

import androidx.recyclerview.widget.RecyclerView;

import com.example.engineertestpranay.models.Hit;

import java.util.List;

public interface MainViewPresenter {
    void onCreate(TitleAdapter recyclerView,MainView view);
    void setData(List<Hit> data);
}
