package com.example.barsiwalkaran.test;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by barsiwal.karan on 7/9/2017.
 */

public class RestApiManager {
    private static Retrofit retrofit = null;
    private static Constants constants;
    public static Retrofit getClient() {
        if (retrofit==null) {
            constants=new Constants();
            retrofit = new Retrofit.Builder()
                    .baseUrl(constants.getBaseUrl())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
