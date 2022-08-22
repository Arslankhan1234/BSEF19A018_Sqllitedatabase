package com.example.student_database;

public class Student {

    private String name;
    private int rollNmber;
    private boolean isEnroll;


    public Student(String name, int rollNmber) {
        this.name = name;
        this.rollNmber = rollNmber;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNmber() {
        return rollNmber;
    }

    public void setRollNmber(int rollNmber) {
        this.rollNmber = rollNmber;
    }
    public boolean isEnroll() {
        return isEnroll;
    }

    public void setEnroll(boolean enroll) {
        isEnroll = enroll;
    }



}
