package com.muviteam.peopleview.model.data;

import com.google.gson.annotations.SerializedName;

public class NombreDao  {


    @SerializedName("title")
    private String stringTitulo;

    @SerializedName("first")
    private String stringNombre;

    @SerializedName("last")
    private String stringApellido;


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
