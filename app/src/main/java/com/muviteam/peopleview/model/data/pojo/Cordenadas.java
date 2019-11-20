package com.muviteam.peopleview.model.data.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Cordenadas implements Serializable {

    @SerializedName("latitude")
    private Double doubleLatitud;

    @SerializedName("longitude")
    private Double doubleLogitud;

    public Cordenadas(Double doubleLatitud, Double doubleLogitud) {
        this.doubleLatitud = doubleLatitud;
        this.doubleLogitud = doubleLogitud;
    }

    public Double getDoubleLatitud() {
        return doubleLatitud;
    }

    public void setDoubleLatitud(Double doubleLatitud) {
        this.doubleLatitud = doubleLatitud;
    }

    public Double getDoubleLogitud() {
        return doubleLogitud;
    }

    public void setDoubleLogitud(Double doubleLogitud) {
        this.doubleLogitud = doubleLogitud;
    }
}
