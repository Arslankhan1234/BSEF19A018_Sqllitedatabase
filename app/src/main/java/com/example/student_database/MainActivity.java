package com.example.student_database;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

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


        add.setOnClickListener(new View.OnClickListener() {
            //MAking bject of student class
            Student stu;

            @Override
            public void onClick(View view) {


                try {
                    stu = new Student(name.getText().toString(), Integer.parseInt(roll.getText().toString()), switchisactive.isChecked());
                    //Toast.makeText(MainActivity.this, studentModel.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
                DbHelper dbHelper  = new DbHelper(MainActivity.this);
                dbHelper.addStudent(stu);
            }
        });


    }
}