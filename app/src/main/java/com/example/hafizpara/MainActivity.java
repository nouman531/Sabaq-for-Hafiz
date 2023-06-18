package com.example.hafizpara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText id,name,age;
    Button btn,fetch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id=findViewById(R.id.id);
        name=findViewById(R.id.name);
        age=findViewById(R.id.age);

        btn=findViewById(R.id.addbtn);
        fetch=findViewById(R.id.secbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processInsert(id.getText().toString(),name.getText().toString(),age.getText().toString());
            }
        });


        fetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,Fetchingdata.class);


            }
        });
    }

    private void processInsert(String i, String n, String a)
    {
        String res= new dbManager(this).addRecords(i,n,a);
        id.setText("");
        name.setText("");
        age.setText("");
        Toast.makeText(getApplicationContext(),res,Toast.LENGTH_SHORT).show();
    }
}