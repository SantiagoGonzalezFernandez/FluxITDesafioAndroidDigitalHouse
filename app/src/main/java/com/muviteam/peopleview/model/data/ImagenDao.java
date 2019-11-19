package com.muviteam.peopleview.model.data;



import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ImagenDao implements Serializable {

    @SerializedName("large")
    private String stringImagenLarga;

    @SerializedName("medium")
    private String stringImagenMediana;

    @SerializedName("thumbnail")
    private String stringImagenAvatar;

    public ImagenDao(String stringImagenLarga, String stringImagenMediana, String stringImagenAvatar) {
        this.stringImagenLarga = stringImagenLarga;
        this.stringImagenMediana = stringImagenMediana;
        this.stringImagenAvatar = stringImagenAvatar;
    }

    public String getLarge() {
        return stringImagenLarga;
    }

    public void setLarge(String large) {
        this.stringImagenLarga = large;
    }

    public String getMedium() {
        return stringImagenMediana;
    }

    public void setMedium(String medium) {
        this.stringImagenMediana = medium;
    }

    public String getThumbnail() {
        return stringImagenAvatar;
    }

    public void setThumbnail(String thumbnail) {
        this.stringImagenAvatar = thumbnail;
    }

}
