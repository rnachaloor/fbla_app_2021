package com.example.fblaapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    //Database details
    public static final String DATABASE_NAME = "attendance.db";
    public static final String TABLE_NAME = "events";
    public static final String COL_1 = "NAME";
    public static final String COL_2 = "ATTENDANCE";

    /**
     * Constructor starts empty database
     * @param context
     */
    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    /**
     * Function creates a table in database
     * @param db the SQLite Database
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ TABLE_NAME + " (" + COL_1 + " TEXT, " + COL_2 + " INTEGER)");
    }

    /**
     * Drops old version of the table if it exists
     * @param db the SQLite database
     * @param oldVersion the old version of the database
     * @param newVersion the new version of the database
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    /**
     * Writes data to the table. If there is no table it returns false.
     * @param name the name of the event
     * @param num the number of people who attend.
     * @return true after inserting data
     */
    public boolean insertData(String name, String num) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, name);
        contentValues.put(COL_2, num);
        long res = db.insert(TABLE_NAME, null, contentValues);
        if (res == -1) {
            return false;
        }
        return true;
    }

    /**
     * Queries all data and returns it.
     * @return results of the query
     */
    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        return res;
    }
}
