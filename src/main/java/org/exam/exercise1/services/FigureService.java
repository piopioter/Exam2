package org.exam.exercise1.services;

public abstract class FigureService extends Figure {

    public static Figure getBiggestFigurePerimeter(Figure[] figures) {
        Figure biggestPerimeter = null;
        double maxPerimeter = Double.NEGATIVE_INFINITY;
        for (Figure figure : figures) {
            double perimeter = figure.calculatePerimeter();
            if (perimeter > maxPerimeter) {
                biggestPerimeter = figure;
                maxPerimeter = perimeter;
            }
        }
        return biggestPerimeter;

    }

    public static Figure getBiggestFigureArea(Figure[] figures) {
        Figure biggestArea = null;
        double maxArea = Double.NEGATIVE_INFINITY;
        for (Figure figure : figures) {
            double area = figure.calculateArea();
            if (area > maxArea) {
                biggestArea = figure;
                maxArea = area;
            }
        }
        return biggestArea;
    }

}
