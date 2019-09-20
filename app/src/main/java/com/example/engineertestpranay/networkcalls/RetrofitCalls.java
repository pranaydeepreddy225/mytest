package com.example.engineertestpranay.networkcalls;

import android.util.Log;

import com.example.engineertestpranay.OnResult;
import com.example.engineertestpranay.models.BaseModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitCalls {
    OnResult mOnResult;
    public RetrofitCalls(OnResult onResult) {
        mOnResult=onResult;
    }

    public void getPosts(int val)
    {
        NetworkInterface netcall=RetrofitInstance.getRetrofitInstance().create(NetworkInterface.class);
        Call<BaseModel> model=netcall.getAllPhotos("v1/search_by_date?tags=story&page="+val);
        model.enqueue(new Callback<BaseModel>() {
            @Override
            public void onResponse(Call<BaseModel> call, Response<BaseModel> response) {
                mOnResult.getResult(response.body().getHits());
                Log.d("rest", String.valueOf(response.body().getHits().size()));
            }

            @Override
            public void onFailure(Call<BaseModel> call, Throwable t) {
             Log.e("rest",t.getMessage());
            }
        });
    }
}
