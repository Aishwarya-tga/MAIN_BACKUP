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

public class PunjabMapActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjab_map);

        SupportMapFragment mapFragment;
        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        LatLng Amristar = new LatLng(31.634694273279624, 74.87183437781108);
        map.addMarker(new MarkerOptions().position(Amristar).title("Amristar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Amristar, 5));

        LatLng Chandigarh = new LatLng(30.729750706435063, 76.76764626221664);
        map.addMarker(new MarkerOptions().position(Chandigarh).title("Chandigarh").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Chandigarh, 5));

        LatLng Ludhiana = new LatLng(30.89148816179351, 75.86662705360352);
        map.addMarker(new MarkerOptions().position(Ludhiana).title("Ludhiana").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Ludhiana, 5));

        LatLng Jalandhar = new LatLng(31.325018270834594, 75.59332942520278);
        map.addMarker(new MarkerOptions().position(Jalandhar).title("Jalandhar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Jalandhar, 5));

        LatLng Pathankot = new LatLng(32.27066798942847, 75.65245615766813);
        map.addMarker(new MarkerOptions().position(Pathankot).title("Pathankot").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Pathankot, 5));

        LatLng Bhatinda = new LatLng(30.222992047883483, 74.94907123768337);
        map.addMarker(new MarkerOptions().position(Bhatinda).title("Bhatinda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Bhatinda, 5));

        LatLng Patiala = new LatLng(30.333006552497764, 76.38845191320263);
        map.addMarker(new MarkerOptions().position(Patiala).title("Patiala").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Patiala, 5));

        LatLng Kapurthala = new LatLng(31.372242675869874, 75.39359080508495);
        map.addMarker(new MarkerOptions().position(Kapurthala).title("Kapurthala").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Kapurthala, 5));

        LatLng Nangal = new LatLng(31.385729013038304, 76.38240276928825);
        map.addMarker(new MarkerOptions().position(Nangal).title("Nangal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Nangal, 5));

        LatLng Ropar = new LatLng(30.962625728587252, 76.52449540056156);
        map.addMarker(new MarkerOptions().position(Ropar).title("Ropar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Ropar, 5));

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