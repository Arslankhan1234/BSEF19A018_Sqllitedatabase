package com.example.student_database;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,age;
    Button add,view,update,delete;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        age=findViewById(R.id.age);
        add=findViewById(R.id.add);
        view=findViewById(R.id.view);
        DbHelper db=new DbHelper(MainActivity.this);


    }
}