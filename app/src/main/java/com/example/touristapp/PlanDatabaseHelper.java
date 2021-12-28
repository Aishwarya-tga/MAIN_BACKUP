package com.example.touristapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class PlanDatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="PLAN";
    public static final String TABLE_NAME="PLANTABLE";

    public static final String COLUMN_1="name";
    public static final String COLUMN_2="phone_number";
    public static final String COLUMN_3="email_id";
    public static final String COLUMN_4="current";
    public static final String COLUMN_5="destination";
    public static final String COLUMN_6="date";
    public static final String COLUMN_7="mode";
    public static final String COLUMN_8="members";
    public static final String COLUMN_9="budget";



    public PlanDatabaseHelper( Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " +TABLE_NAME+ "(ID INTEGER PRIMARY KEY AUTOINCREMENT, "
                + " name TEXT, "
                + " phone_number INT, "
                + " email_id TEXT, "
                + " current TEXT, "
                + " destination TEXT, "
                + " date NUMERIC, "
                + " mode TEXT, "
                + " members INT,"
                + " budget INT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }
}
