package com.example.hafizpara;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbManager extends SQLiteOpenHelper {
    private static final String dbname="dbHafiz";


    public dbManager(@Nullable Context context) {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query="create table tbl_content(id text primary key,name text,age text)";
        sqLiteDatabase.execSQL(query);

    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String query="DROP TABLE IF EXISTS tbl_content";
        sqLiteDatabase.execSQL(query);
        onCreate(sqLiteDatabase);


    }

    public String addRecords(String id,String name,String age)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("id",id);
        cv.put("name",name);
        cv.put("age",age);
        float result=db.insert("tbl_content",null,cv);
        if(result==-1){
            return "failed";
        }else{
            return "Success";
        }
    }

    public Cursor readalldatad(){

        SQLiteDatabase db=this.getWritableDatabase();
        String query="select * from tbl_content order by id desc";
        Cursor cursor= db.rawQuery(query,null);
        return cursor;
    }
}
