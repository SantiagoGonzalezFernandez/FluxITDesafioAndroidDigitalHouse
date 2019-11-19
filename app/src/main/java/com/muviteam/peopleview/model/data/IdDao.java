package com.muviteam.peopleview.model.data;




import com.google.gson.annotations.SerializedName;

public class IdDao {

    @SerializedName("name")
    private String stringName;

    @SerializedName("value")
    private String stringValue;



    public String getName() {
        return stringName;
    }

    public void setName(String name) {
        this.stringName = name;
    }

    public String getValue() {
        return stringValue;
    }

    public void setValue(String value) {
        this.stringValue = value;
    }

}
