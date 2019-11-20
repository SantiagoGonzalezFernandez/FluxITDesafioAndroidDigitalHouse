package com.muviteam.peopleview.view;

import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.muviteam.peopleview.R;
import com.muviteam.peopleview.model.data.User;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    public static final String KEY_USER = "key_user";

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        int intStatus = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());

        if(intStatus == ConnectionResult.SUCCESS){
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }else{
            Dialog dialog = GooglePlayServicesUtil.getErrorDialog(intStatus, (Activity) getApplicationContext(),10);
            dialog.show();
        }

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        User user = (User) bundle.getSerializable(KEY_USER);

        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        UiSettings uiSettings = mMap.getUiSettings();
        uiSettings.setZoomControlsEnabled(true);

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(user.getUbicacionDao().getCordenadasDao().getDoubleLatitud(), user.getUbicacionDao().getCordenadasDao().getDoubleLogitud());
        mMap.addMarker(new MarkerOptions().position(sydney).title(user.getNombreDao().getStringNombre() + " " + user.getNombreDao().getStringApellido()));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
