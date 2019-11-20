package com.muviteam.peopleview.model.data;



import android.util.Log;
import android.widget.Toast;

import com.muviteam.peopleview.model.ContainerUser;
import com.muviteam.peopleview.model.UserRetrofitDao;

import com.muviteam.peopleview.utils.ResultListener;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserDao extends UserRetrofitDao {

    private static final String BASE_URL = "https://randomuser.me/";

    public UserDao() {
        super(BASE_URL);
    }

    public void traerUsers(final ResultListener<ContainerUser> listenerDelController, String cantiadadDeUsuarios, Integer page, String seed){
        Call<ContainerUser> call = usersService.traerUsers(cantiadadDeUsuarios,page,seed);
        call.enqueue(new Callback<ContainerUser>() {
            @Override
            public void onResponse(Call<ContainerUser> call, Response<ContainerUser> response) {
                ContainerUser containerUser = response.body();
                listenerDelController.finish(containerUser);
            }

            @Override
            public void onFailure(Call<ContainerUser> call, Throwable t) {
                Log.d("ERROR", "En traer users");
            }
        });
    }

}
