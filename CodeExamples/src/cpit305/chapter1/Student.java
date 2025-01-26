package cpit305.chapter1;


public class Student {

    //Properties or Characteristics الخصائص

    private int id;
    private String name;
    private double gpa;

    //Constructor الباني
    public Student() {
        id = -1;
        name = "UNDEFINED";
        gpa = 0.0;
    }

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public void print() {
        System.out.println("ID: " + id);
        System.out.println("NAME: " + name);
        System.out.println("GPA: " + gpa);
    }
}
