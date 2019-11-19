package com.muviteam.peopleview.controller;

import com.muviteam.peopleview.model.data.User;
import com.muviteam.peopleview.model.data.UserDao;
import com.muviteam.peopleview.utils.ResultListener;

import java.util.List;

public class ControllerUser {

    private static final String USERS_QUANTITY = "20";
    private UserDao userDao;

    public ControllerUser() {
        this.userDao = new UserDao();
    }

    public void traerUser(final ResultListener<List<User>> listenerDeLaVista){
        userDao.traerUsers(new ResultListener<List<User>>() {
            @Override
            public void finish(List<User> result) {
                listenerDeLaVista.finish(result);
            }
        },USERS_QUANTITY);
    }

}
