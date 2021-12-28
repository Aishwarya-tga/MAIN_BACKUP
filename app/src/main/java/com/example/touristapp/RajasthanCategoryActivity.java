package com.example.touristapp;

import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RajasthanCategoryActivity extends AppCompatActivity {

    private SQLiteDatabase db;
    private Cursor cursor;
    private Toolbar toolbar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajasthan_category);

        toolbar = findViewById(R.id.ToolBar_id);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textView = findViewById(R.id.apptitle);
        gradColourText();

        Button button = (Button)findViewById(R.id.favbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                favbuttonfunc();
            }
        });

        ListView listrajasthan = (ListView) findViewById(R.id.list_rajasthan);

        SQLiteOpenHelper touristDatabaseHelper = new TouristDatabaseHelper(this);
        try {
            db = touristDatabaseHelper.getReadableDatabase();
            cursor = db.query("RAJASTHAN",
                    new String[] {"_id","NAME"},
                    null,null,null,null,null);

            SimpleCursorAdapter listAdapter = new SimpleCursorAdapter(this,
                    android.R.layout.simple_list_item_1,
                    cursor,
                    new String[] {"NAME"},
                    new int[] {android.R.id.text1},
                    0);
            listrajasthan.setAdapter(listAdapter);
        }catch (SQLiteException e) {
            Toast toast = Toast.makeText(this,"Database Unavailable",Toast.LENGTH_SHORT);
            toast.show();
        }

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listrajasthan,
                                    View itemView,
                                    int position,
                                    long id) {
                Intent intent = new Intent(RajasthanCategoryActivity.this , RajasthanActivity.class);
                intent.putExtra(RajasthanActivity.EXTRA_RAJASTHANID,(int) id);
                startActivity(intent);
            }
        };

        listrajasthan.setOnItemClickListener(itemClickListener);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
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
    public void favbuttonfunc() {
        Intent intent = new Intent(RajasthanCategoryActivity.this,RajasthanFavorite.class);
        startActivity(intent);
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

    @Override
    public void onDestroy() {
        super.onDestroy();
        cursor.close();
        db.close();
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
