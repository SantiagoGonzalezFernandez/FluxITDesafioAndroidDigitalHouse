package com.muviteam.peopleview.model.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DodDao implements Parcelable {

    @SerializedName("date")
    private String stringDate;

    @SerializedName("age")
    private String stringEdad;

    public final static Parcelable.Creator<DodDao> CREATOR = new Creator<DodDao>() {

        @SuppressWarnings("unchecked")
        public DodDao createFromParcel(Parcel in) {
            DodDao dodDao = new DodDao();
            dodDao.stringDate = ((String) in.readValue((String.class.getClassLoader())));
            dodDao.stringEdad = ((String) in.readValue((String.class.getClassLoader())));
            return dodDao;
        }

        public DodDao[] newArray(int size) {
            return (new DodDao[size]);
        }

    };

    public String getStringDate() {
        return stringDate;
    }

    public void setStringDate(String stringDate) {
        this.stringDate = stringDate;
    }

    public String getStringEdad() {
        return stringEdad;
    }

    public void setStringEdad(String stringEdad) {
        this.stringEdad = stringEdad;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(stringDate);
        dest.writeValue(stringEdad);
    }
}
