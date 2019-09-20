package com.example.engineertestpranay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.engineertestpranay.models.Hit;
import com.example.engineertestpranay.networkcalls.RetrofitCalls;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView{
    RecyclerView mRecyclerView;
    TitleAdapter mAdapter;
    MainViewPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mAdapter=new TitleAdapter();
        mRecyclerView=findViewById(R.id.recycler);
        mRecyclerView.setAdapter(mAdapter);
        mPresenter= new  MainViewPresenterImpl(getApplicationContext());
        mPresenter.onCreate(mAdapter,this);


    }


}
