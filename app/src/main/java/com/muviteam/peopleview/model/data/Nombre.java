package com.muviteam.peopleview.model.data;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Nombre implements Serializable {


    @SerializedName("title")
    private String stringTitulo;

    @SerializedName("first")
    private String stringNombre;

    @SerializedName("last")
    private String stringApellido;

    public Nombre(String stringTitulo, String stringNombre, String stringApellido) {
        this.stringTitulo = stringTitulo;
        this.stringNombre = stringNombre;
        this.stringApellido = stringApellido;
    }

    public String getStringTitulo() {
        return stringTitulo;
    }

    public void setStringTitulo(String stringTitulo) {
        this.stringTitulo = stringTitulo;
    }

    public String getStringNombre() {
        return stringNombre;
    }

    public void setStringNombre(String stringNombre) {
        this.stringNombre = stringNombre;
    }

    public String getStringApellido() {
        return stringApellido;
    }

    public void setStringApellido(String stringApellido) {
        this.stringApellido = stringApellido;
    }


}
