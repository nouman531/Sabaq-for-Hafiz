package com.example.hafizpara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Fetchingdata extends AppCompatActivity {


    RecyclerView recview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetchingdata);

        recview =findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));
    }
}