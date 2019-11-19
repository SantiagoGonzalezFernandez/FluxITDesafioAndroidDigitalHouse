package com.muviteam.peopleview.model.data;




import com.google.gson.annotations.SerializedName;

public class IdDao {

    @SerializedName("name")
    private String name;

    @SerializedName("value")
    private String value;



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

}
