package com.example.touristapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class KeralaMapActivity extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;
    private Toolbar toolbar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala_map);

        toolbar = findViewById(R.id.ToolBar_id);
        setSupportActionBar(toolbar);

        textView = findViewById(R.id.apptitle);
        gradColourText();

        SupportMapFragment mapFragment;
        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.plan:
                        startActivity(new Intent(getApplicationContext()
                                ,PlanActivity.class ));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class ));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.about:
                        startActivity(new Intent(getApplicationContext()
                                ,About.class ));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        LatLng Alappuzha = new LatLng(9.500352503216345, 76.32940000775844);
        map.addMarker(new MarkerOptions().position(Alappuzha).title("Alappuzha").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Alappuzha,5));

        LatLng Munnar = new LatLng(10.100736528883552, 77.05763391065632);
        map.addMarker(new MarkerOptions().position(Munnar).title("Munnar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Munnar,5));

        LatLng Kumarakom = new LatLng(9.616434779878569, 76.4427393510352);
        map.addMarker(new MarkerOptions().position(Kumarakom).title("Kumarakom").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Kumarakom,5));

        LatLng Wayanad = new LatLng(11.724881646312626, 76.09403049295386);
        map.addMarker(new MarkerOptions().position(Wayanad).title("Wayanad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Wayanad,5));

        LatLng Kochi = new LatLng(9.939059856593055, 76.26658972537501);
        map.addMarker(new MarkerOptions().position(Kochi).title("Kochi").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Kochi,5));

        LatLng Kovalam = new LatLng(8.39950649428338, 76.9822265251956);
        map.addMarker(new MarkerOptions().position(Kovalam).title("Kovalam").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Kovalam,5));

        LatLng Kozhikode = new LatLng(11.262971933600076, 75.81360397703203);
        map.addMarker(new MarkerOptions().position(Kozhikode).title("Kozhikode").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Kozhikode,5));

        LatLng Idukki = new LatLng(9.862223978905098, 76.94426797339439);
        map.addMarker(new MarkerOptions().position(Idukki).title("Idukki").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Idukki,5));

        LatLng Thrissur = new LatLng(10.50462862047655, 76.21878431334272);
        map.addMarker(new MarkerOptions().position(Thrissur).title("Thrissur").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Thrissur,5));

        LatLng Ponmudi = new LatLng(8.76130522467854, 77.11456057046851);
        map.addMarker(new MarkerOptions().position(Ponmudi).title("Ponmudi").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Ponmudi,5));


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
    private void gradColourText() {
        TextPaint textPaint =  textView.getPaint();
        float width = textPaint.measureText("Tourist App");

        Shader shader = new LinearGradient(0,0,width,textView.getTextSize(),
                new int[]{
                        Color.parseColor("#fed6e3"),
                        Color.parseColor("#a8edea"),
                },null,Shader.TileMode.CLAMP);
        textView.getPaint().setShader(shader);

    }
    //for share option on toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT,"Hey it's from Tourist App");
        startActivity(Intent.createChooser(intent,"Share Via"));
        return super.onOptionsItemSelected(item);
    }
}