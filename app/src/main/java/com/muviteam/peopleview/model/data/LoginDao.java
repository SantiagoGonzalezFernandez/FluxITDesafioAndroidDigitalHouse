package com.muviteam.peopleview.model.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginDao implements Parcelable{

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

    public final static Parcelable.Creator<LoginDao> CREATOR = new Creator<LoginDao>() {

        @SuppressWarnings("unchecked")
        public LoginDao createFromParcel(Parcel in) {
            LoginDao loginDao = new LoginDao();
            loginDao.stringUsername = ((String) in.readValue((String.class.getClassLoader())));
            loginDao.stringPassword = ((String) in.readValue((String.class.getClassLoader())));
            loginDao.stringSalt = ((String) in.readValue((String.class.getClassLoader())));
            loginDao.stringMd5 = ((String) in.readValue((String.class.getClassLoader())));
            loginDao.stringSha1 = ((String) in.readValue((String.class.getClassLoader())));
            loginDao.stringSha256 = ((String) in.readValue((String.class.getClassLoader())));
            return loginDao;
        }

        public LoginDao[] newArray(int size) {
            return (new LoginDao[size]);
        }

    };

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

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(stringUsername);
        dest.writeValue(stringPassword);
        dest.writeValue(stringSalt);
        dest.writeValue(stringMd5);
        dest.writeValue(stringSha1);
        dest.writeValue(stringSha256);
    }

    public int describeContents() {
        return 0;
    }

}
