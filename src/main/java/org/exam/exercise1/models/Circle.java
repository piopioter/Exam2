package org.exam.exercise1.models;

import org.exam.exercise1.services.NotNegativeNumberException;
import org.exam.exercise1.services.Figure;

public  class Circle extends Figure {

    private double r;

    public Circle(double r) throws NotNegativeNumberException {
        if (r < 0)
            throw new NotNegativeNumberException("Wartość parametru nie może być ujemna");
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }


    @Override
    public String toString() {
        return super.toString() +  "Koło o promienu " + r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0;
    }


}
