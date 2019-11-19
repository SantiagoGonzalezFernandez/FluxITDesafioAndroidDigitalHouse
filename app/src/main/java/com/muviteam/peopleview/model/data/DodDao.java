package com.muviteam.peopleview.model.data;


import com.google.gson.annotations.SerializedName;

public class DodDao {

    @SerializedName("date")
    private String stringDate;

    @SerializedName("age")
    private String stringEdad;



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


}
