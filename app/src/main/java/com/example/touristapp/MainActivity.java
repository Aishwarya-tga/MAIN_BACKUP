package com.example.touristapp;

import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity{

    private Toolbar toolbar;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.ToolBar_id);
        setSupportActionBar(toolbar);


        textView = findViewById(R.id.apptitle);
        gradColourText();

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView,
                                            View itemView,
                                            int position,
                                            long id) {
                if (position ==0) {
                    Intent intent = new Intent(MainActivity.this, KeralaCategoryActivity.class);
                    startActivity(intent);
                }
                if(position ==1) {
                    Intent intent = new Intent(MainActivity.this, TamilCategoryActivity.class);
                    startActivity(intent);
                }
                if(position ==2) {
                    Intent intent = new Intent(MainActivity.this, RajasthanCategoryActivity.class);
                    startActivity(intent);
                }
                if(position ==3) {
                    Intent intent = new Intent(MainActivity.this, UttarCategoryActivity.class);
                    startActivity(intent);
                }
                if(position ==4) {
                    Intent intent = new Intent(MainActivity.this, DelhiCategoryActivity.class);
                    startActivity(intent);
                }
                if(position ==5) {
                    Intent intent = new Intent(MainActivity.this, PunjabCategoryActivity.class);
                    startActivity(intent);
                }
                if(position ==6) {
                    Intent intent = new Intent(MainActivity.this,GoaCategoryActivity.class);
                    startActivity(intent);
                }

            }

        };

        ListView listView = (ListView) findViewById (R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.favourite:
                        startActivity(new Intent(getApplicationContext()
                                ,Favourite.class ));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
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

}