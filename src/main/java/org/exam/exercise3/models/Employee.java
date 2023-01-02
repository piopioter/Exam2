package org.exam.exercise3.models;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee(String name, String lastname, String pesel, String city, String position, double salary) {
        super(name, lastname, pesel, city);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public double getIncome() {
        return salary;
    }
}
