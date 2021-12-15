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

public class DelhiMapActivity extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi_map);

        SupportMapFragment mapFragment;
        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        LatLng India = new LatLng(28.61357715474159, 77.23118824545519);
        map.addMarker(new MarkerOptions().position(India).title("India Gate").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(India, 5));

        LatLng Redfort = new LatLng(28.6566016722231, 77.24112758582666);
        map.addMarker(new MarkerOptions().position(Redfort).title("The Red Fort").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Redfort, 5));

        LatLng Qutub = new LatLng(28.524399970459008, 77.1856922588402);
        map.addMarker(new MarkerOptions().position(Qutub).title("Qutub Minar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Qutub, 5));

        LatLng Lotustemple = new LatLng(28.553416591214482, 77.25865473608465);
        map.addMarker(new MarkerOptions().position(Lotustemple).title("The Lotus Temple").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Lotustemple, 5));

        LatLng Jamamasjid = new LatLng(28.650537954483223, 77.23346355513746);
        map.addMarker(new MarkerOptions().position(Jamamasjid).title("Jama Masjid").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Jamamasjid, 5));

        LatLng Gurudwara = new LatLng(28.62617009963408, 77.20972995200094);
        map.addMarker(new MarkerOptions().position(Gurudwara).title("Gurudwara Bangla Sahib").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Gurudwara, 5));

        LatLng Humayun = new LatLng(28.59352038254539, 77.25067897470744);
        map.addMarker(new MarkerOptions().position(Humayun).title("Humayun's Tomb").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Humayun, 5));

        LatLng Akshardham = new LatLng(28.612447435806864, 77.27724043979194);
        map.addMarker(new MarkerOptions().position(Akshardham).title("Akshardham").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Akshardham, 5));

        LatLng Rajpath = new LatLng(28.613846352989196, 77.20881039746428);
        map.addMarker(new MarkerOptions().position(Rajpath).title("Rajpath & Rastrapathi Bhavan").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Rajpath, 5));

        LatLng  Jantar = new LatLng(28.62708293434345, 77.21657305328395);
        map.addMarker(new MarkerOptions().position(Jantar).title("Jantar Mantar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Jantar, 5));

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