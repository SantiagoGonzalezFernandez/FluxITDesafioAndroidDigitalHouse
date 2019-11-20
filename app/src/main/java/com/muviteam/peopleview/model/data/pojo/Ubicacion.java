package com.muviteam.peopleview.model.data.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Ubicacion implements Serializable {

    @SerializedName("street")
    private Calle calle;

    @SerializedName("city")
    private String stringCiudad;

    @SerializedName("state")
    private String stringEstado;

    @SerializedName("country")
    private String stringPais;

    @SerializedName("postcode")
    private String stringCodigoPostal;

    @SerializedName("coordinates")
    private Cordenadas cordenadas;


    public Ubicacion(Calle calle, String stringCiudad, String stringEstado, String stringPais, String stringCodigoPostal, Cordenadas cordenadas) {
        this.calle = calle;
        this.stringCiudad = stringCiudad;
        this.stringEstado = stringEstado;
        this.stringPais = stringPais;
        this.stringCodigoPostal = stringCodigoPostal;
        this.cordenadas = cordenadas;
    }

    public Cordenadas getCordenadas() {
        return cordenadas;
    }

    public void setCordenadas(Cordenadas cordenadas) {
        this.cordenadas = cordenadas;
    }

    public String getStringPais() {
        return stringPais;
    }

    public void setStringPais(String stringPais) {
        this.stringPais = stringPais;
    }

    public Calle getCalle() {
        return calle;
    }

    public void setCalle(Calle calle) {
        this.calle = calle;
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
