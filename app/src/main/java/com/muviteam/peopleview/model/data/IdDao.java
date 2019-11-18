package com.muviteam.peopleview.model.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IdDao implements Parcelable {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("value")
    @Expose
    private String value;

    public final static Parcelable.Creator<IdDao> CREATOR = new Creator<IdDao>() {

        @SuppressWarnings("unchecked")
        public IdDao createFromParcel(Parcel in) {
            IdDao idDao = new IdDao();
            idDao.name = ((String) in.readValue((String.class.getClassLoader())));
            idDao.value = ((String) in.readValue((String.class.getClassLoader())));
            return idDao;
        }

        public IdDao[] newArray(int size) {
            return (new IdDao[size]);
        }

    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(value);
    }

    public int describeContents() {
        return 0;
    }
}
