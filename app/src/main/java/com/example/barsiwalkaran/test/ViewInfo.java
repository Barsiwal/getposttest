package com.example.barsiwalkaran.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ViewInfo extends AppCompatActivity {
    private Api api;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_info);
        GetInfo();
    }
    public void GetInfo(){

        api = RestApiManager.getClient().create(Api.class);
        api.getposts().enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                Log.d("okok",response.toString());
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                Log.d("ekek",t.toString());
                Toast.makeText(getApplicationContext(), "nope", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
