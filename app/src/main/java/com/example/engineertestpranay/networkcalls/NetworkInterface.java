package com.example.engineertestpranay.networkcalls;

import com.example.engineertestpranay.models.BaseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface NetworkInterface  {

    @GET()
    Call<BaseModel> getAllPhotos(@Url String value);
}
