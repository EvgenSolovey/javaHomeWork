package com.solovey.homeWorkNine.taskFour;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Rectangle(12, 23);
        figures[1] = new Circle(30);
        figures[2] = new Triangle(11, 7);
        figures[3] = new Trapezoid(25, 12, 11);
        for (Figure figure : figures) {
            System.out.println("Площадь " + figure.nameFigure() + " равна: " + figure.calculatingArea());
        }
    }
}


