package Models;

public class Student {

    private String name;
    private int rollNmber;


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



}
