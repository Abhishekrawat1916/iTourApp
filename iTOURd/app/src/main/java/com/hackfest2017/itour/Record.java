package com.hackfest2017.itour;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class Record extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "five.db";
    private static final String TABLE_NAME = "Record";
    private static final String COLUMN_USERNAME= "username";
    private static final String COLUMN_FULLNAME = "fullname";
    private static final String COLUMN_PASSWORD = "password";


    public Record(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " +TABLE_NAME +"(" +
                 COLUMN_USERNAME + " TEXT PRIMARY KEY, "+
                COLUMN_FULLNAME+ " TEXT,"+COLUMN_PASSWORD + " TEXT " + ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    public void insert(Database data)
    {
        ContentValues values = new ContentValues();
        values.put(COLUMN_USERNAME,data.get_username());
        Log.e("demo","Inside the insert func in record");
        SQLiteDatabase db= getWritableDatabase();
        db.insert(TABLE_NAME,null,values);
        db.close();

    }
    public void insert1(Database data)
    {
        ContentValues values1 = new ContentValues();
        values1.put(COLUMN_FULLNAME,data.get_fullname());
        SQLiteDatabase db= getWritableDatabase();
        db.insert(TABLE_NAME,null,values1);
        db.close();

    }
    public void insert2(Database data)
    {
        ContentValues values2 = new ContentValues();
        values2.put(COLUMN_PASSWORD,data.get_password());
        SQLiteDatabase db= getWritableDatabase();
        db.insert(TABLE_NAME,null,values2);
        db.close();

    }
    public String DbToString() {
       try{ String dbStr="";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME + " WHERE 1";

        Cursor c = db.rawQuery(query, null);
        c.moveToFirst();
        Log.e("demo", "cursor created");

            while(!c.isAfterLast()){
                dbStr = c.getString(c.getColumnIndex(COLUMN_USERNAME));
                if(dbStr == SignIn.editText.getText().toString())
                    break;
               Log.e("demo", "cursor create");
              }
//
        db.close();
        return dbStr;
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
        return "";
    }

//                Log.e("demo",c.getString(c.getColumnIndex(COLUMN_USERNAME)));
//            } while (c.moveToNext());

        }
//        while(!c.isAfterLast())
//        {
//            if(c.getString(c.getColumnIndex("username")) != null)
//            {
//
//  dbString += c.getString(c.getColumnIndex("username"));
//                //dbString += "\n";
//            }
//
//
//        }

