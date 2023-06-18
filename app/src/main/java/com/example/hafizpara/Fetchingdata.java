package com.example.hafizpara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;

import java.util.ArrayList;

public class Fetchingdata extends AppCompatActivity {


    RecyclerView recview;
    ArrayList<modelClass> dataHolder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetchingdata);

        recview =findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        Cursor cursor=new dbManager(this).readalldatad();
        //by using this cursor we feed this data in the dataholder

        while(cursor.moveToNext()){
            modelClass obj= new modelClass(cursor.getString(0),cursor.getString(1),cursor.getString(2));
            dataHolder.add(obj);
        }
    }
}