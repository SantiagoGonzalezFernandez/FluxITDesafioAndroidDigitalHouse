package com.muviteam.peopleview.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.muviteam.peopleview.R;

public class DetalleUserActivity extends AppCompatActivity {



    private ImageView imageViewImagenLarga;
    private TextView textViewNombreUser;
    private TextView textViewEmailUser;

    private TextView textViewEdadUser;
    private TextView textViewFechaDeNacimientoUser;
    private TextView textViewGeneroUser;

    private TextView textViewCalleUser;
    private TextView textViewNumeroCalleUser;
    private TextView textViewCiudadUser;
    private TextView textViewEstadoUser;
    private TextView textViewPaisUser;
    private TextView textViewCodigoPostalUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_user);

        encontrarComponentesPorId();

    }

    private void encontrarComponentesPorId(){

        imageViewImagenLarga = findViewById(R.id.DetalleUserActivity_ImageView_ImagenLarga);
        textViewNombreUser = findViewById(R.id.DetalleUserActivity_TextView_NombreUser);
        textViewEmailUser = findViewById(R.id.DetalleUserActivity_TextView_EmailUser);

        textViewEdadUser = findViewById(R.id.DetalleUserActivity_TextView_EdadUser);
        textViewFechaDeNacimientoUser = findViewById(R.id.DetalleUserActivity_TextView_FechaDeNacimientoUser);
        textViewGeneroUser = findViewById(R.id.DetalleUserActivity_TextView_GeneroUser);

        textViewCalleUser = findViewById(R.id.DetalleUserActivity_TextView_CalleUser);
        textViewNumeroCalleUser = findViewById(R.id.DetalleUserActivity_TextView_NumeroCalleUser);
        textViewCiudadUser = findViewById(R.id.DetalleUserActivity_TextView_CityUser);
        textViewEstadoUser = findViewById(R.id.DetalleUserActivity_TextView_EstadoUser);
        textViewPaisUser = findViewById(R.id.DetalleUserActivity_TextView_PaisUser);
        textViewCodigoPostalUser = findViewById(R.id.DetalleUserActivity_TextView_CodigoPostalUser);

    }
}
