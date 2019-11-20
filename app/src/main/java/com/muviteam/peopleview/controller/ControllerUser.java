package com.muviteam.peopleview.controller;

import com.muviteam.peopleview.model.ContainerUser;
import com.muviteam.peopleview.model.data.UserDao;
import com.muviteam.peopleview.utils.ResultListener;

public class ControllerUser {

    private static final String USERS_QUANTITY = "20";
    private UserDao userDao;

    private String seed = "";
    private Integer page = 1;

    private Boolean trajoMasPost = true;

    public ControllerUser() {
        this.userDao = new UserDao();
    }

    public void traerUser(final ResultListener<ContainerUser> listenerDeLaVista) {
        if (trajoMasPost) {
            trajoMasPost = false;
            userDao.traerUsers(new ResultListener<ContainerUser>() {
                @Override
                public void finish(ContainerUser result) {
                    seed = result.getInfo().getStringSeed();
                    page++;
                    listenerDeLaVista.finish(result);
                    trajoMasPost = true;
                }
            }, USERS_QUANTITY, page, seed);
        }
    }


}
