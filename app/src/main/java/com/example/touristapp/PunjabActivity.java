package com.example.touristapp;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PunjabActivity extends AppCompatActivity {

    public static final String EXTRA_PUNJABID = "punjabId";
    private Toolbar toolbar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjab);

        toolbar = findViewById(R.id.ToolBar_id);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textView = findViewById(R.id.apptitle);
        gradColourText();

        int punjabId = (Integer)getIntent().getExtras().get(EXTRA_PUNJABID);

        //CREATE THE CURSOR
        SQLiteOpenHelper touristDatabaseHelper = new TouristDatabaseHelper(this);
        try {
            SQLiteDatabase db = touristDatabaseHelper.getReadableDatabase();
            Cursor cursor = db.query("PUNJAB",
                    new String[] {"NAME","DETAIL","AREA","ELEVATION","TYPE","BTTV","DEST","IMAGE_RESOURCE_ID","RATING"},
                    "_id = ?",
                    new String[] {Integer.toString(punjabId) },
                    null,null,null);

            if(cursor.moveToFirst()) {

                String nameText = cursor.getString(0);
                String detailText = cursor.getString(1);
                String areaText = cursor.getString(2);
                String elevationText = cursor.getString(3);
                String typeText = cursor.getString(4);
                String bttvText = cursor.getString(5);
                String destText = cursor.getString(6);
                int photoId = cursor.getInt(7);
                String ratingText = cursor.getString(8);

                TextView name = (TextView) findViewById(R.id.name);
                name.setText(nameText);

                TextView detail = (TextView) findViewById(R.id.detail);
                detail.setText(detailText);

                TextView area = (TextView) findViewById(R.id.area);
                area.setText(areaText);

                TextView elevation = (TextView) findViewById(R.id.elevation);
                elevation.setText(elevationText);

                TextView type = (TextView) findViewById(R.id.type);
                type.setText(typeText);

                TextView bttv = (TextView) findViewById(R.id.bttv);
                bttv.setText(bttvText);

                TextView dest = (TextView) findViewById(R.id.dest);
                dest.setText(destText);

                ImageView photo = (ImageView) findViewById(R.id.photo);
                photo.setImageResource(photoId);
                photo.setContentDescription(nameText);

                TextView rating = (TextView) findViewById(R.id.rating);
                rating.setText(ratingText);

                Button button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openhello();
                    }
                });

            }
            cursor.close();
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this,"Database Unavailable",Toast.LENGTH_SHORT);
            toast.show();
        }

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
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

    public void openhello() {
        Intent intent = new Intent(this,PunjabMapActivity.class);
        startActivity(intent);

    }
}