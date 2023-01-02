package org.exam.exercise1.models;

import org.exam.exercise1.services.Figure;
import org.exam.exercise1.services.NotNegativeNumberException;

public class Rectangle extends Figure {

    private double a;
    private double b;

    public Rectangle(double a, double b) throws NotNegativeNumberException {
        if(a < 0 || b < 0)
            throw new NotNegativeNumberException("Wartość parametru nie może być ujemna");
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return  super.toString() + "Prostokąt o bokach " + a + "x" + b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.a, a) == 0 && Double.compare(rectangle.b, b) == 0;
    }


}
