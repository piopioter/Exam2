package org.exam.exercise3.models;

public abstract class Person {
    private String name;
    private String lastname;
    private String pesel;
    private String city;

    public Person(String name, String lastname, String pesel, String city) {
        this.name = name;
        this.lastname = lastname;
        this.pesel = pesel;
        this.city = city;
    }

    public abstract double getIncome();

    public static double getBiggestIncome(Person[] people) {
        double biggestIncome = 0;
        for (Person person : people) {
            if (person != null) {
                if (biggestIncome < person.getIncome())
                    biggestIncome = person.getIncome();

            }
        }
        return biggestIncome;
    }

    public static int getSex(Person[] people) {
        int counter = 0;
        for (Person person : people) {
            if (person != null)
                if (person.pesel.charAt(9) % 2 == 0)
                    counter++;


        }
        return counter;
    }
}
