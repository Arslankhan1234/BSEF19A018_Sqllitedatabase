package com.example.student_database;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter {

    List<Student> studentlist;
    Activity contex;
    public MyAdapter(@NonNull Activity context, List<Student> st) {
        super(context, R.layout.activity_customlistview);
        this.studentlist=st;
        this.contex=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=contex.getLayoutInflater();
        View view=inflater.inflate(R.layout.activity_customlistview,null,true);
    //  View view= LayoutInflater.from(contex).inflate(R.layout.activity_customlistview,parent,false);
        TextView textv=view.findViewById(R.id.showname);
        TextView roll=view.findViewById(R.id.showroll);
        textv.setText(studentlist.get(position).getName());
        roll.setText(studentlist.get(position).getRollNmber());
        return view;

    }
}

