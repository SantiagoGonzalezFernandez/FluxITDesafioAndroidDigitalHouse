package com.muviteam.peopleview.model.data.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class User implements Serializable {

    public static final String BASE_URL = "https://randomuser.me/api/";

    @SerializedName("gender")
    private String stringGenero;

    @SerializedName("name")
    private Nombre nombre;

    @SerializedName("location")
    private Ubicacion ubicacion;

    @SerializedName("email")
    private String stringEmail;

    @SerializedName("login")
    private Login login;

    @SerializedName("dob")
    private Dod dod;

    @SerializedName("registered")
    private Registro registro;

    @SerializedName("phone")
    private String stringTelefono;

    @SerializedName("cell")
    private String stringCelular;

    @SerializedName("id")
    private Id id;

    @SerializedName("picture")
    private Imagen imagen;

    @SerializedName("nat")
    private String stringNacionalidad;


    public User(String stringGenero, Nombre nombre, Ubicacion ubicacion, String stringEmail, Login login, Dod dod, Registro registro, String stringTelefono, String stringCelular, Id id, Imagen imagen, String stringNacionalidad) {
        this.stringGenero = stringGenero;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.stringEmail = stringEmail;
        this.login = login;
        this.dod = dod;
        this.registro = registro;
        this.stringTelefono = stringTelefono;
        this.stringCelular = stringCelular;
        this.id = id;
        this.imagen = imagen;
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

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getStringEmail() {
        return stringEmail;
    }

    public void setStringEmail(String stringEmail) {
        this.stringEmail = stringEmail;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Dod getDod() {
        return dod;
    }

    public void setDod(Dod dod) {
        this.dod = dod;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
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

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public String getStringNacionalidad() {
        return stringNacionalidad;
    }

    public void setStringNacionalidad(String stringNacionalidad) {
        this.stringNacionalidad = stringNacionalidad;
    }
}
