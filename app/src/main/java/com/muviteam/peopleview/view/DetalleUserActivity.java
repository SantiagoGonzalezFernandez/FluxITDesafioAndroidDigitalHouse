package com.muviteam.peopleview.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.muviteam.peopleview.R;
import com.muviteam.peopleview.model.data.User;

public class DetalleUserActivity extends AppCompatActivity implements AdapterUser.ListenerDelAdapter{


    public static final String KEY_USER = "key_user";

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

    private Button buttonUbicacionOnline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_user);

        encontrarComponentesPorId();

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        User user = (User) bundle.getSerializable(KEY_USER);

        Glide.with(imageViewImagenLarga.getContext()).load(user.getImagenDao().getLarge()).placeholder(R.drawable.load).error(R.drawable.load).into(imageViewImagenLarga);
        textViewNombreUser.setText(user.getNombreDao().getStringNombre() + " " + user.getNombreDao().getStringApellido());
        textViewEmailUser.setText(user.getStringEmail());

        textViewEdadUser.setText(user.getDodDao().getStringEdad());
        textViewFechaDeNacimientoUser.setText(user.getDodDao().getStringDate());
        textViewGeneroUser.setText(user.getStringGenero());

        textViewCalleUser.setText(user.getUbicacionDao().getCalleDao().getStringNombre());
        textViewNumeroCalleUser.setText(user.getUbicacionDao().getCalleDao().getStringNumero());
        textViewCiudadUser.setText(user.getUbicacionDao().getStringCiudad());
        textViewEstadoUser.setText(user.getUbicacionDao().getStringEstado());
        textViewPaisUser.setText(user.getUbicacionDao().getStringPais());
        textViewCodigoPostalUser.setText(user.getUbicacionDao().getStringCodigoPostal());

        configuroButtonUbicacionOnline(user);

    }

    private void configuroButtonUbicacionOnline(final User user){
        buttonUbicacionOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarUser(user);
            }
        });
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

        buttonUbicacionOnline = findViewById(R.id.DetalleUserActivity_Button_UbicacionOnline);
    }

    @Override
    public void informarUser(User user) {
        Intent intent = new Intent(DetalleUserActivity.this, MapsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(DetalleUserActivity.KEY_USER, user);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
