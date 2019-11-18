package com.muviteam.peopleview.model.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class User {

    public static final String BASE_URL = "https://randomuser.me/api/";

    @SerializedName("gender")
    private String stringGenero;

    @SerializedName("name")
    private NombreDao nombreDao;

    @SerializedName("location")
    private UbicacionDao ubicacionDao;

    @SerializedName("email")
    private String stringEmail;

    @SerializedName("login")
    private LoginDao loginDao;

    @SerializedName("dob")
    private String stringDob;

    @SerializedName("registered")
    private String stringRegistro;

    @SerializedName("phone")
    private String stringTelefono;

    @SerializedName("cell")
    private String stringCelular;

    @SerializedName("id")
    private IdDao idDao;

    @SerializedName("picture")
    private ImagenDao imagenDao;

    @SerializedName("nat")
    private String stringNacionalidad;

    public final static Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {

        @SuppressWarnings("unchecked")
        public User createFromParcel(Parcel in) {
            User user = new User();
            user.stringGenero = ((String) in.readValue((String.class.getClassLoader())));
            user.nombreDao = ((NombreDao) in.readValue((NombreDao.class.getClassLoader())));
            user.ubicacionDao = ((UbicacionDao) in.readValue((UbicacionDao.class.getClassLoader())));
            user.stringEmail = ((String) in.readValue((String.class.getClassLoader())));
            user.loginDao = ((LoginDao) in.readValue((LoginDao.class.getClassLoader())));
            user.stringDob = ((String) in.readValue((String.class.getClassLoader())));
            user.stringRegistro = ((String) in.readValue((String.class.getClassLoader())));
            user.stringTelefono = ((String) in.readValue((String.class.getClassLoader())));
            user.stringCelular = ((String) in.readValue((String.class.getClassLoader())));
            user.idDao = ((IdDao) in.readValue((IdDao.class.getClassLoader())));
            user.imagenDao = ((ImagenDao) in.readValue((ImagenDao.class.getClassLoader())));
            user.stringNacionalidad = ((String) in.readValue((String.class.getClassLoader())));
            return user;
        }

        public User[] newArray(int size) {
            return (new User[size]);
        }

    };

    public User(String stringGenero, NombreDao nombreDao, UbicacionDao ubicacionDao, String stringEmail, LoginDao loginDao, String stringDob, String stringRegistro, String stringTelefono, String stringCelular, IdDao idDao, ImagenDao imagenDao, String stringNacionalidad) {
        this.stringGenero = stringGenero;
        this.nombreDao = nombreDao;
        this.ubicacionDao = ubicacionDao;
        this.stringEmail = stringEmail;
        this.loginDao = loginDao;
        this.stringDob = stringDob;
        this.stringRegistro = stringRegistro;
        this.stringTelefono = stringTelefono;
        this.stringCelular = stringCelular;
        this.idDao = idDao;
        this.imagenDao = imagenDao;
        this.stringNacionalidad = stringNacionalidad;
    }

    public User(){

    }

    public String getStringGenero() {
        return stringGenero;
    }

    public void setStringGenero(String stringGenero) {
        this.stringGenero = stringGenero;
    }

    public NombreDao getNombreDao() {
        return nombreDao;
    }

    public void setNombreDao(NombreDao nombreDao) {
        this.nombreDao = nombreDao;
    }

    public UbicacionDao getUbicacionDao() {
        return ubicacionDao;
    }

    public void setUbicacionDao(UbicacionDao ubicacionDao) {
        this.ubicacionDao = ubicacionDao;
    }

    public String getStringEmail() {
        return stringEmail;
    }

    public void setStringEmail(String stringEmail) {
        this.stringEmail = stringEmail;
    }

    public LoginDao getLoginDao() {
        return loginDao;
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    public String getStringDob() {
        return stringDob;
    }

    public void setStringDob(String stringDob) {
        this.stringDob = stringDob;
    }

    public String getStringRegistro() {
        return stringRegistro;
    }

    public void setStringRegistro(String stringRegistro) {
        this.stringRegistro = stringRegistro;
    }

    public String getStringTelefono() {
        return stringTelefono;
    }

    public void setStringTelefono(String stringTelefono) {
        this.stringTelefono = stringTelefono;
    }

    public String getStringCelular() {
        return stringCelular;
    }

    public void setStringCelular(String stringCelular) {
        this.stringCelular = stringCelular;
    }

    public IdDao getIdDao() {
        return idDao;
    }

    public void setIdDao(IdDao idDao) {
        this.idDao = idDao;
    }

    public ImagenDao getImagenDao() {
        return imagenDao;
    }

    public void setImagenDao(ImagenDao imagenDao) {
        this.imagenDao = imagenDao;
    }

    public String getStringNacionalidad() {
        return stringNacionalidad;
    }

    public void setStringNacionalidad(String stringNacionalidad) {
        this.stringNacionalidad = stringNacionalidad;
    }
}
