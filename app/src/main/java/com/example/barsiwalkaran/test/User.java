package com.example.barsiwalkaran.test;

import com.google.gson.annotations.SerializedName;

/**
 * Created by barsiwal.karan on 7/7/2017.
 */

public class User {
    @SerializedName("name")
    private String name;
    @SerializedName("job")
    private String job;

    public User(String Name, String Job) {
        this.name = name;
        this.job = job;
    }


}
