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

public class TamilMapActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamil_map);

        SupportMapFragment mapFragment;
        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        LatLng Chennai = new LatLng(13.090294863949747, 80.21861393432788);
        map.addMarker(new MarkerOptions().position(Chennai).title("Chennai").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Chennai,5));

        LatLng Thanjavur = new LatLng(10.793284665914946, 79.13831291669355);
        map.addMarker(new MarkerOptions().position(Thanjavur).title("Thanjavur").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Thanjavur,5));

        LatLng Ooty = new LatLng(11.408989959447448, 76.69548080570759);
        map.addMarker(new MarkerOptions().position(Ooty).title("Ooty").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Ooty,5));

        LatLng Rameshwaram = new LatLng(9.288497259017038, 79.31167596949362);
        map.addMarker(new MarkerOptions().position(Rameshwaram).title("Rameshwaram").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Rameshwaram,5));

        LatLng Madurai = new LatLng(9.931356989576575, 78.12728389935003);
        map.addMarker(new MarkerOptions().position(Madurai).title("Madurai").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Madurai,5));

        LatLng KanyaKumari = new LatLng(8.08674181581895, 77.54861698605164);
        map.addMarker(new MarkerOptions().position(KanyaKumari).title("KanyaKumari").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(KanyaKumari,5));

        LatLng Mahabalipuram = new LatLng(12.623834088498093, 80.19689277459021);
        map.addMarker(new MarkerOptions().position(Mahabalipuram).title("Mahabalipuram").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Mahabalipuram,5));

        LatLng Kodaikanal = new LatLng(10.240134068843954, 77.49343858931121);
        map.addMarker(new MarkerOptions().position(Kodaikanal).title("Kodaikanal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Kodaikanal,5));

        LatLng Kanchipuram = new LatLng(12.817660919145178, 79.69834929578501);
        map.addMarker(new MarkerOptions().position(Kanchipuram).title("Kanchipuram").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Kanchipuram,5));

        LatLng Vellore = new LatLng(12.887586108158436, 79.11490620763756);
        map.addMarker(new MarkerOptions().position(Vellore).title("Vellore").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Vellore,5));


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

