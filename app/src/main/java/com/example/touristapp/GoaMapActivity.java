package com.example.touristapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoaMapActivity extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa_map);

        SupportMapFragment mapFragment;
        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        LatLng Panaji = new LatLng(15.49414340555222, 73.83339595537826);
        map.addMarker(new MarkerOptions().position(Panaji).title("Panaji").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Panaji, 5));

        LatLng Vasco = new LatLng(15.400840084296693, 73.80250310347544);
        map.addMarker(new MarkerOptions().position(Vasco).title("Vasco Da Gama").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Vasco, 5));

        LatLng Mapusa = new LatLng(15.602563373812314, 73.81402802320318);
        map.addMarker(new MarkerOptions().position(Mapusa).title("Mapusa").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Mapusa, 5));

        LatLng Calangute = new LatLng(15.536177577144864, 73.76329469630673);
        map.addMarker(new MarkerOptions().position(Calangute).title("Calangute").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Calangute, 5));

        LatLng Margao = new LatLng(15.283877935042089, 73.99217664507822);
        map.addMarker(new MarkerOptions().position(Margao).title("Margao").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Margao, 5));

        LatLng Candolim = new LatLng(15.510196813130191, 73.77210576142372);
        map.addMarker(new MarkerOptions().position(Candolim).title("Candolim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Candolim, 5));

        LatLng Anjuna = new LatLng(15.586810378608018, 73.74481197975427);
        map.addMarker(new MarkerOptions().position(Anjuna).title("Anjuna").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Anjuna, 5));

        LatLng Pernem = new LatLng(15.718825225137891, 73.79280279230159);
        map.addMarker(new MarkerOptions().position(Pernem).title("Pernem").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Pernem, 5));

        LatLng Salim = new LatLng(15.512995099321078, 73.8704583125595);
        map.addMarker(new MarkerOptions().position(Salim).title("Salim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Salim, 5));

        googleMap.getUiSettings().setCompassEnabled(true);
        googleMap.getUiSettings().setZoomControlsEnabled(true);
        googleMap.getUiSettings().setScrollGesturesEnabled(true);
        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            //TODO:CONSIDER Calling
            // ActivityCompat#requestPermissions



            return;
        }
        googleMap.setMyLocationEnabled(true);
    }
}