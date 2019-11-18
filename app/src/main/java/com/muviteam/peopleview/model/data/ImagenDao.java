package com.muviteam.peopleview.model.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImagenDao implements Parcelable {

    @SerializedName("large")
    @Expose
    private String stringImagenLarga;

    @SerializedName("medium")
    @Expose
    private String stringImagenMediana;

    @SerializedName("thumbnail")
    @Expose
    private String stringImagenAvatar;

    public final static Parcelable.Creator<ImagenDao> CREATOR = new Creator<ImagenDao>() {

        @SuppressWarnings("unchecked")
        public ImagenDao createFromParcel(Parcel in) {
            ImagenDao imagenDao = new ImagenDao();
            imagenDao.stringImagenLarga = ((String) in.readValue((String.class.getClassLoader())));
            imagenDao.stringImagenMediana = ((String) in.readValue((String.class.getClassLoader())));
            imagenDao.stringImagenAvatar = ((String) in.readValue((String.class.getClassLoader())));
            return imagenDao;
        }

        public ImagenDao[] newArray(int size) {
            return (new ImagenDao[size]);
        }

    };

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

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(stringImagenLarga);
        dest.writeValue(stringImagenMediana);
        dest.writeValue(stringImagenAvatar);
    }

    public int describeContents() {
        return 0;
    }
}
