package com.muviteam.peopleview.model.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NombreDao implements Parcelable {


    @SerializedName("title")
    private String stringTitulo;

    @SerializedName("first")
    private String stringNombre;

    @SerializedName("last")
    private String stringApellido;

    public final static Parcelable.Creator<NombreDao> CREATOR = new Creator<NombreDao>() {

        @SuppressWarnings("unchecked")
        public NombreDao createFromParcel(Parcel in) {
            NombreDao nombreDao = new NombreDao();
            nombreDao.stringTitulo = ((String) in.readValue((String.class.getClassLoader())));
            nombreDao.stringNombre = ((String) in.readValue((String.class.getClassLoader())));
            nombreDao.stringApellido = ((String) in.readValue((String.class.getClassLoader())));
            return nombreDao;
        }

        public NombreDao[] newArray(int size) {
            return (new NombreDao[size]);
        }

    };

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

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(stringTitulo);
        dest.writeValue(stringNombre);
        dest.writeValue(stringApellido);
    }

    public int describeContents() {
        return 0;
    }
}
