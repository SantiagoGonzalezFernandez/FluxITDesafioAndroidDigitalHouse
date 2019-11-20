package com.muviteam.peopleview.model.data;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Calle implements Serializable {

    @SerializedName("number")
    private String stringNumero;

    @SerializedName("name")
    private String stringNombre;

    public Calle(String stringNumero, String stringNombre) {
        this.stringNumero = stringNumero;
        this.stringNombre = stringNombre;
    }

    public String getStringNombre() {
        return stringNombre;
    }

    public void setStringNombre(String stringNombre) {
        this.stringNombre = stringNombre;
    }

    public String getStringNumero() {
        return stringNumero;
    }

    public void setStringNumero(String stringNumero) {
        this.stringNumero = stringNumero;
    }
}
