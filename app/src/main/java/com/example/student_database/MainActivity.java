package com.example.student_database;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    EditText name,roll;
    Button add,view,update,delete;
    Switch switchisactive;
    ListView listViewStudent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        roll=findViewById(R.id.rollno);
        add=findViewById(R.id.add);
        view=findViewById(R.id.view);
        switchisactive=findViewById(R.id.active);
        listViewStudent=findViewById(R.id.list);

        DbHelper db=new DbHelper(MainActivity.this);


    }
}