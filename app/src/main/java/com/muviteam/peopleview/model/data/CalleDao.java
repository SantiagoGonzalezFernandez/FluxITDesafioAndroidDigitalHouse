package com.muviteam.peopleview.model.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CalleDao implements Parcelable {

    @SerializedName("number")
    private String stringNumero;

    @SerializedName("name")
    private String stringNombre;

    public final static Parcelable.Creator<CalleDao> CREATOR = new Creator<CalleDao>() {

        @SuppressWarnings("unchecked")
        public CalleDao createFromParcel(Parcel in) {
            CalleDao calleDao = new CalleDao();
            calleDao.stringNumero = ((String) in.readValue((String.class.getClassLoader())));
            calleDao.stringNombre = ((String) in.readValue((String.class.getClassLoader())));
            return calleDao;
        }

        public CalleDao[] newArray(int size) {
            return (new CalleDao[size]);
        }

    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(stringNumero);
        dest.writeValue(stringNombre);
    }
}
