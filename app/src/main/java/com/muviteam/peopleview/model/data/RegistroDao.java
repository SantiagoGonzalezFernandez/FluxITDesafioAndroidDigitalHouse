package com.muviteam.peopleview.model.data;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RegistroDao implements Serializable {

    @SerializedName("date")
    private String stringDate;

    @SerializedName("age")
    private String stringEdad;

    public RegistroDao(String stringDate, String stringEdad) {
        this.stringDate = stringDate;
        this.stringEdad = stringEdad;
    }

    public String getStringDate() {
        return stringDate;
    }

    public void setStringDate(String stringDate) {
        this.stringDate = stringDate;
    }

    public String getStringEdad() {
        return stringEdad;
    }

    public void setStringEdad(String stringEdad) {
        this.stringEdad = stringEdad;
    }


}
