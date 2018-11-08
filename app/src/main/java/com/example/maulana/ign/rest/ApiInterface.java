package com.example.maulana.ign.rest;

import com.example.maulana.ign.model.ResponseIgn;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("v2/top-headlines?sources=ign&apiKey=197af1a8301744ed9cfcfb669c464fd4")
    Call<ResponseIgn> getIgn();
}
