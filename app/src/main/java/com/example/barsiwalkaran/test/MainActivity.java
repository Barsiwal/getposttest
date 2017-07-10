package com.example.barsiwalkaran.test;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = (EditText) findViewById(R.id.name);
        final EditText job = (EditText) findViewById(R.id.job);
        Button send = (Button) findViewById(R.id.button);

        send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                User user = new User(name.getText().toString(), job.getText().toString());
                sendRequest(user);
            }
        });
    }

    private void sendRequest(User user) {
        Retrofit.Builder builder = new Retrofit.Builder().baseUrl("https://reqres.in/api/users").addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();
        UserData ser = retrofit.create(UserData.class);
        Call<User> call = ser.createaccount(user);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });

    }
}
