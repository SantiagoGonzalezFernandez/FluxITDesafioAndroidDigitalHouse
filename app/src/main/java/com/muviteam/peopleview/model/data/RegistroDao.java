package com.muviteam.peopleview.model.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegistroDao implements Parcelable {

    @SerializedName("date")
    @Expose
    private String stringDate;

    @SerializedName("age")
    @Expose
    private String stringEdad;

    public final static Parcelable.Creator<RegistroDao> CREATOR = new Creator<RegistroDao>() {

        @SuppressWarnings("unchecked")
        public RegistroDao createFromParcel(Parcel in) {
            RegistroDao registroDao = new RegistroDao();
            registroDao.stringDate = ((String) in.readValue((String.class.getClassLoader())));
            registroDao.stringEdad = ((String) in.readValue((String.class.getClassLoader())));
            return registroDao;
        }

        public RegistroDao[] newArray(int size) {
            return (new RegistroDao[size]);
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
