package com.example.touristapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
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
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RajasthanMapActivity extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;
    private Toolbar toolbar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajasthan_map);

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
        LatLng Jaipur  = new LatLng(26.89983902596524, 75.79398040814205);
        map.addMarker(new MarkerOptions().position(Jaipur).title("Jaipur").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Jaipur,5));

        LatLng Udaipur = new LatLng(24.603275639828823, 73.70533912306038);
        map.addMarker(new MarkerOptions().position(Udaipur).title("Udaipur").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Udaipur,5));

        LatLng Jaisalmer = new LatLng(26.913218257266756, 70.90314094358658);
        map.addMarker(new MarkerOptions().position(Jaisalmer).title("Jaisalmer").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Jaisalmer,5));

        LatLng Jodhpur = new LatLng(26.263569228002247, 73.02298747446017);
        map.addMarker(new MarkerOptions().position(Jodhpur).title("Jodhpur").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Jodhpur,5));

        LatLng Pushkar = new LatLng(26.48856960979057, 74.54533726530177);
        map.addMarker(new MarkerOptions().position(Pushkar).title("Pushkar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Pushkar,5));

        LatLng Dausa = new LatLng(26.89401051947693, 76.3375562218974);
        map.addMarker(new MarkerOptions().position(Dausa).title("Dausa").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Dausa,5));

        LatLng Bikaner = new LatLng(28.02807097180791, 73.32211481352704);
        map.addMarker(new MarkerOptions().position(Bikaner).title("Bikaner").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Bikaner,5));

        LatLng SawaiMadhopur  = new LatLng(26.031320733344906, 76.36253288058515);
        map.addMarker(new MarkerOptions().position(SawaiMadhopur).title("Sawai Madhopur").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(SawaiMadhopur,5));

        LatLng Chittogarh = new LatLng(24.89360980897299, 74.62845794862318);
        map.addMarker(new MarkerOptions().position(Chittogarh).title("Chittogarh").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Chittogarh,5));

        LatLng Ajmer = new LatLng(26.448308000742937, 74.62884457432324);
        map.addMarker(new MarkerOptions().position(Ajmer).title("Ajmer").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Ajmer,5));


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