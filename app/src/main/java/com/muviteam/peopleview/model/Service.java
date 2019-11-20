package com.muviteam.peopleview.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

    @GET("/api/")
    Call<ContainerUser> traerUsers(@Query("results") String cantidadDeResultados,
                                   @Query("page") String paginaActual,
                                   @Query("seed") String Semilla);

}
