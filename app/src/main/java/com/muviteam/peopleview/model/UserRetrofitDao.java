package com.muviteam.peopleview.model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserRetrofitDao {

    private Retrofit retrofit;
    protected Service usersService;

    public UserRetrofitDao(String baseURL) {
        retrofit = new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        usersService = retrofit.create(Service.class);
    }
}
