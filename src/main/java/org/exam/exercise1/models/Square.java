package org.exam.exercise1.models;

import org.exam.exercise1.services.NotNegativeNumberException;
import org.exam.exercise1.services.Figure;



public class Square extends Figure {

    private double a;

    public Square(double a) throws NotNegativeNumberException {
        if (a < 0)
            throw new NotNegativeNumberException("Wartość parametru nie może być ujemna");
        this.a = a;
    }


    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }

    @Override
    public double calculateArea() {
        return 2 * a;
    }

    @Override
    public String toString() {
        return super.toString() + "Kwadrat o boku " + a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.a, a) == 0;
    }


}
