package com.muviteam.peopleview.model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET("?results=20")
    Call<ContainerUser> traerUsers();
}
