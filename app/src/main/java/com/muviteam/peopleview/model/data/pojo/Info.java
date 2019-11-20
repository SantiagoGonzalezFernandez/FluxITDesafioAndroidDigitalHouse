package com.muviteam.peopleview.model.data.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Info implements Serializable {

    @SerializedName("seed")
    private String stringSeed;

    @SerializedName("results")
    private String stringResults;

    @SerializedName("page")
    private String stringPage;

    @SerializedName("version")
    private String stringVersion;

    public Info(String stringSeed, String stringResults, String stringPage, String stringVersion) {
        this.stringSeed = stringSeed;
        this.stringResults = stringResults;
        this.stringPage = stringPage;
        this.stringVersion = stringVersion;
    }

    public String getStringSeed() {
        return stringSeed;
    }

    public void setStringSeed(String stringSeed) {
        this.stringSeed = stringSeed;
    }

    public String getStringResults() {
        return stringResults;
    }

    public void setStringResults(String stringResults) {
        this.stringResults = stringResults;
    }

    public String getStringPage() {
        return stringPage;
    }

    public void setStringPage(String stringPage) {
        this.stringPage = stringPage;
    }

    public String getStringVersion() {
        return stringVersion;
    }

    public void setStringVersion(String stringVersion) {
        this.stringVersion = stringVersion;
    }
}
