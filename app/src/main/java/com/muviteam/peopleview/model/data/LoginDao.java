package com.muviteam.peopleview.model.data;

import com.google.gson.annotations.SerializedName;

public class LoginDao {

    @SerializedName("username")
    private String stringUsername;

    @SerializedName("password")
    private String stringPassword;

    @SerializedName("salt")
    private String stringSalt;

    @SerializedName("md5")
    private String stringMd5;

    @SerializedName("sha1")
    private String stringSha1;

    @SerializedName("sha256")
    private String stringSha256;


    public String getStringUsername() {
        return stringUsername;
    }

    public void setStringUsername(String stringUsername) {
        this.stringUsername = stringUsername;
    }

    public String getStringPassword() {
        return stringPassword;
    }

    public void setStringPassword(String stringPassword) {
        this.stringPassword = stringPassword;
    }

    public String getStringSalt() {
        return stringSalt;
    }

    public void setStringSalt(String stringSalt) {
        this.stringSalt = stringSalt;
    }

    public String getStringMd5() {
        return stringMd5;
    }

    public void setStringMd5(String stringMd5) {
        this.stringMd5 = stringMd5;
    }

    public String getStringSha1() {
        return stringSha1;
    }

    public void setStringSha1(String stringSha1) {
        this.stringSha1 = stringSha1;
    }

    public String getStringSha256() {
        return stringSha256;
    }

    public void setStringSha256(String stringSha256) {
        this.stringSha256 = stringSha256;
    }



}
