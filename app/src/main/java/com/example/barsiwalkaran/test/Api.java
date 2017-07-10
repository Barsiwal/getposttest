package com.example.barsiwalkaran.test;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by barsiwal.karan on 7/9/2017.
 */

public interface Api {
    @GET("/posts")
    Call<List<Model>> getposts();
//    @GET("/api/unknown/2")
//    Call<List<Model>> getposts();
}
