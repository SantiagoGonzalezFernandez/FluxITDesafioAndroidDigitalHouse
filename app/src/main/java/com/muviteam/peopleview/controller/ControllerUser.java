package com.muviteam.peopleview.controller;

import com.muviteam.peopleview.model.ContainerUser;
import com.muviteam.peopleview.model.data.UserDao;
import com.muviteam.peopleview.utils.ResultListener;

public class ControllerUser {

    private static final String USERS_QUANTITY = "20";
    private UserDao userDao;

    public ControllerUser() {
        this.userDao = new UserDao();
    }

    public void traerUser(final ResultListener<ContainerUser> listenerDeLaVista){
        userDao.traerUsers(new ResultListener<ContainerUser>() {
            @Override
            public void finish(ContainerUser result) {
                listenerDeLaVista.finish(result);
            }
        },USERS_QUANTITY);
    }


}
