package com.example.touristapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PlanActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView textView;
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);

        //toolbar
        toolbar = findViewById(R.id.ToolBar_id);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //toolbar name
        textView = findViewById(R.id.apptitle);
        gradColourText();


        //bottom navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.plan);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.plan:
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class ));
                        overridePendingTransition(0,0);

                    case R.id.about:
                        startActivity(new Intent(getApplicationContext()
                                ,About.class ));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        EditText person_name= (EditText)findViewById(R.id.personname);
        EditText person_phone= (EditText)findViewById(R.id.personphone);
        EditText person_email= (EditText)findViewById(R.id.personemail);
        EditText person_current= (EditText)findViewById(R.id.personcurrent);
        EditText person_dest= (EditText)findViewById(R.id.persondest);
        EditText person_date= (EditText)findViewById(R.id.persondate);
        EditText person_mode= (EditText)findViewById(R.id.personmode);
        EditText person_members= (EditText)findViewById(R.id.personmembers);
        EditText person_budget= (EditText)findViewById(R.id.personbudget);

        ImageButton person_button = (ImageButton) findViewById(R.id.personbutton);
        openHelper = new PlanDatabaseHelper(this);

        person_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = person_name.getText().toString();
                String phone_number = person_phone.getText().toString();
                String email_id = person_email.getText().toString();
                String current = person_current.getText().toString();
                String destination = person_dest.getText().toString();
                String date = person_date.getText().toString();
                String mode = person_mode.getText().toString();
                String members = person_members.getText().toString();
                String budget  = person_budget.getText().toString();
                db = openHelper.getWritableDatabase();
                insertData(name,phone_number,email_id,current,destination,date,mode,members,budget);
                Toast.makeText(getApplicationContext(),"YOUR TRIP IS BOOKED", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void insertData(String name,String phone_number,String email_id,String current,String destination,String date,String mode,String members,String budget){
        ContentValues contentValues = new ContentValues();
        contentValues.put(PlanDatabaseHelper.COLUMN_1,name);
        contentValues.put(PlanDatabaseHelper.COLUMN_2,phone_number);
        contentValues.put(PlanDatabaseHelper.COLUMN_3,email_id);
        contentValues.put(PlanDatabaseHelper.COLUMN_4,current);
        contentValues.put(PlanDatabaseHelper.COLUMN_5,destination);
        contentValues.put(PlanDatabaseHelper.COLUMN_6,date);
        contentValues.put(PlanDatabaseHelper.COLUMN_7,mode);
        contentValues.put(PlanDatabaseHelper.COLUMN_8,members);
        contentValues.put(PlanDatabaseHelper.COLUMN_9,budget);
        long id = db.insert(PlanDatabaseHelper.TABLE_NAME,null,contentValues);
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