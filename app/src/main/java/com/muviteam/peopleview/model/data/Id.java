package com.muviteam.peopleview.model.data;




import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Id implements Serializable {

    @SerializedName("name")
    private String stringName;

    @SerializedName("value")
    private String stringValue;

    public Id(String stringName, String stringValue) {
        this.stringName = stringName;
        this.stringValue = stringValue;
    }

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
