package org.exam.exercise1.app;


import org.exam.exercise1.services.NotNegativeNumberException;
import org.exam.exercise1.services.Figure;
import org.exam.exercise1.services.FigureService;


public class ShapeRunner {
    public static void main(String[] args) throws NotNegativeNumberException {

        Figure[] figures = {Figure.createSquare(10), Figure.createCircle(10), Figure.createRectangle(10, 20),
                Figure.createSquare(15)};

        printInfo(figures);
        getEqualsFigure(figures);

        Figure resultPerimeter = FigureService.getBiggestFigurePerimeter(figures);
        System.out.println("Najwiekszy obwód to:" + resultPerimeter);

        Figure resultArea = FigureService.getBiggestFigureArea(figures);
        System.out.println("Najwieksze pole to:" + resultArea);

    }

    public static void printInfo(Figure[] figures) {
        for (Figure f : figures) {
            System.out.println(f);
        }
    }

    public static void getEqualsFigure(Figure[] figures) throws NotNegativeNumberException {
        for (Figure f : figures) {
            if (f.equals(Figure.createRectangle(10, 20))) {
                System.out.println("tu powinno wejść");
            }

        }

    }
}