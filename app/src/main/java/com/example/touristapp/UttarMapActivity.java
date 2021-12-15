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

public class UttarMapActivity extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uttar_map);

        SupportMapFragment mapFragment;
        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        LatLng Agra = new LatLng(27.170659371792006, 77.99992301678233);
        map.addMarker(new MarkerOptions().position(Agra).title("Agra").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Agra, 5));

        LatLng  Varanasi = new LatLng(25.326642396396096, 82.995569448789);
        map.addMarker(new MarkerOptions().position(Varanasi).title("Varanasi").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Varanasi, 5));

        LatLng Lucknow = new LatLng(26.819213074639784, 80.93975549488474);
        map.addMarker(new MarkerOptions().position(Lucknow).title("Lucknow").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Lucknow, 5));

        LatLng Allahabad = new LatLng(25.467307081588533, 81.83384607533384);
        map.addMarker(new MarkerOptions().position(Allahabad).title("Allahabad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Allahabad, 5));

        LatLng Mathura = new LatLng(27.480144111431578, 77.69204837764401);
        map.addMarker(new MarkerOptions().position(Mathura).title("Mathura").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Mathura, 5));

        LatLng Fatehpur = new LatLng(27.100010606637532, 77.67053726034923);
        map.addMarker(new MarkerOptions().position(Fatehpur).title("Fatehpur Sikri").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Fatehpur, 5));

        LatLng Vrindavan = new LatLng(27.566180532852066, 77.66709500206416);
        map.addMarker(new MarkerOptions().position(Vrindavan).title("Vrindavan").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Vrindavan, 5));

        LatLng Jhansi = new LatLng(25.456911726440666, 78.5585090554027);
        map.addMarker(new MarkerOptions().position(Jhansi).title("Jhansi").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Jhansi, 5));

        LatLng Kushinagar = new LatLng(26.741235778309225, 83.88805117931335);
        map.addMarker(new MarkerOptions().position(Kushinagar).title("Kushinagar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Kushinagar, 5));

        LatLng Meerut = new LatLng(28.97913525970302, 77.69689775602986);
        map.addMarker(new MarkerOptions().position(Meerut).title("Meerut").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Meerut, 5));

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