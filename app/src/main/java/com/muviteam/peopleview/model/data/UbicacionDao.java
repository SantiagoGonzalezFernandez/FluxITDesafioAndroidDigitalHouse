package com.muviteam.peopleview.model.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UbicacionDao implements Parcelable {

    @SerializedName("street")
    private String stringCalle;

    @SerializedName("city")
    private String stringCiudad;

    @SerializedName("state")
    private String stringEstado;

    @SerializedName("postcode")
    private String stringCodigoPostal;

    public final static Parcelable.Creator<UbicacionDao> CREATOR = new Creator<UbicacionDao>() {

        @SuppressWarnings("unchecked")
        public UbicacionDao createFromParcel(Parcel in) {
            UbicacionDao ubicacionDao = new UbicacionDao();
            ubicacionDao.stringCalle = ((String) in.readValue((String.class.getClassLoader())));
            ubicacionDao.stringCiudad = ((String) in.readValue((String.class.getClassLoader())));
            ubicacionDao.stringEstado = ((String) in.readValue((String.class.getClassLoader())));
            ubicacionDao.stringCodigoPostal = ((String) in.readValue((Integer.class.getClassLoader())));
            return ubicacionDao;
        }

        public UbicacionDao[] newArray(int size) {
            return (new UbicacionDao[size]);
        }

    };

    public String getStringCalle() {
        return stringCalle;
    }

    public void setStringCalle(String stringCalle) {
        this.stringCalle = stringCalle;
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

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(stringCalle);
        dest.writeValue(stringCiudad);
        dest.writeValue(stringEstado);
        dest.writeValue(stringCodigoPostal);
    }

    public int describeContents() {
        return 0;
    }
}
