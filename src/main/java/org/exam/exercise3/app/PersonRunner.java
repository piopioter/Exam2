package org.exam.exercise3.app;


import org.exam.exercise3.models.Employee;
import org.exam.exercise3.models.Person;
import org.exam.exercise3.models.Student;

public class PersonRunner {
    public static void main(String[] args) {

        Student jan = new Student("Jan", "Kowalski", "97012313175", "Lębork", "naukowa",
                1500);
        Student paulina = new Student("Paulina", "Ryś", "96102002682", "Poznań", "naukowa",
                2000);
        Employee paweł = new Employee("Paweł", "Nowak", "80041513579", "Opole",
                "Nauczyciel", 2300);
        Employee karolina = new Employee("Karolina", "Uroda", "85010102468", "Nowogard",
                "Pedagog", 3000);


        Person[] people = {jan, paulina, paweł, karolina};

        System.out.println(Person.getBiggestIncome(people));
        System.out.println(Person.getSex(people));

    }
}
