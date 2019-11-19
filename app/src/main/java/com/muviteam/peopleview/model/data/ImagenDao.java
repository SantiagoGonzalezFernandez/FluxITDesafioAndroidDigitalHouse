package com.muviteam.peopleview.model.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImagenDao{

    @SerializedName("large")
    @Expose
    private String stringImagenLarga;

    @SerializedName("medium")
    @Expose
    private String stringImagenMediana;

    @SerializedName("thumbnail")
    @Expose
    private String stringImagenAvatar;


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
