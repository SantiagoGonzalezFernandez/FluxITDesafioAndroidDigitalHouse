package com.muviteam.peopleview.model;



import android.util.Log;

import com.muviteam.peopleview.utils.ResultListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserDao extends UserRetrofitDao{

    private static final String BASE_URL = "https://randomuser.me/api/";

    public UserDao(String baseURL) {
        super(baseURL);
    }

    public void traerUsers(final ResultListener<List<User>> listenerDelController){
        Call<ContainerUser> call = usersService.traerUsers();
        call.enqueue(new Callback<ContainerUser>() {
            @Override
            public void onResponse(Call<ContainerUser> call, Response<ContainerUser> response) {
                ContainerUser containerUser = response.body();
                listenerDelController.finish(containerUser.getResults());
            }

            @Override
            public void onFailure(Call<ContainerUser> call, Throwable t) {
                Log.d("ERROR", "En traer users");
            }
        });
    }
}
