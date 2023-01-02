package org.exam.exercise3.models;

public class Student extends Person {
    private String group;
    private double scholarship;


    public Student(String name, String lastname, String pesel, String city, String group, double scholarship) {
        super(name, lastname, pesel, city);
        this.group = group;
        this.scholarship = scholarship;
    }

    @Override
    public double getIncome() {
        return scholarship;
    }
}
