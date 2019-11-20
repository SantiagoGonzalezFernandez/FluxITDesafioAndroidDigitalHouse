package com.muviteam.peopleview.model;

import com.muviteam.peopleview.model.data.pojo.Info;
import com.muviteam.peopleview.model.data.pojo.User;

import java.util.List;

public class ContainerUser {

    private Info info;

    private List<User> results;

    public List<User> getResults(){
        return results;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
