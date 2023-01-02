package org.exam.exercise1.services;

import org.exam.exercise1.models.Circle;
import org.exam.exercise1.models.Rectangle;
import org.exam.exercise1.models.Square;

public abstract class Figure {
    private static int counter = 1;
    private int figuresCounter;

    public Figure() {
        figuresCounter = counter++;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();


    public static Figure createCircle(double r) throws NotNegativeNumberException {
        return new Circle(r);
    }

    public static Figure createSquare(double a) throws NotNegativeNumberException {
        return new Square(a);
    }

    public static Figure createRectangle(double a, double b) throws NotNegativeNumberException {
        return new Rectangle(a, b);
    }

    public void printInfo(Figure[] figures){
        for (Figure figure : figures) {
            System.out.println(figure);
        }

    }


    @Override
    public String toString() {
        return "Figura nr " + figuresCounter + ": ";
    }


}
