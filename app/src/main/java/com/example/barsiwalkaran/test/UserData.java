package com.example.barsiwalkaran.test;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by barsiwal.karan on 7/7/2017.
 */

public interface UserData {
    @POST("user")
    Call<User> createaccount(@Body User user);

}
