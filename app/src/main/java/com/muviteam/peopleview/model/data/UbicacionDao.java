package com.muviteam.peopleview.model.data;

import com.google.gson.annotations.SerializedName;

public class UbicacionDao  {

    @SerializedName("street")
    private CalleDao calleDao;

    @SerializedName("city")
    private String stringCiudad;

    @SerializedName("state")
    private String stringEstado;

    @SerializedName("postcode")
    private String stringCodigoPostal;


    public CalleDao getCalleDao() {
        return calleDao;
    }

    public void setCalleDao(CalleDao calleDao) {
        this.calleDao = calleDao;
    }

    public String getStringCiudad() {
        return stringCiudad;
    }

    public void setStringCiudad(String stringCiudad) {
        this.stringCiudad = stringCiudad;
    }

    public String getStringEstado() {
        return stringEstado;
    }

    public void setStringEstado(String stringEstado) {
        this.stringEstado = stringEstado;
    }

    public String getStringCodigoPostal() {
        return stringCodigoPostal;
    }

    public void setStringCodigoPostal(String stringCodigoPostal) {
        this.stringCodigoPostal = stringCodigoPostal;
    }


}
