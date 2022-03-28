package com.solovey.homeWorkNine.taskFour;

public class Triangle extends Figure {
    private final static String NAME = "прямоугольного треугольника";
    private double sideOne; // размер одного катета
    private double sideTwo; // размер второго катета

    public Triangle(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public static String getNAME() {
        return NAME;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    @Override
    public String nameFigure() {
        return NAME;
    }

    @Override
    public double calculatingArea() {
        return 0.5 * sideOne * sideTwo; // Площадь прямоугольного треугольника по двум катетам
    }
}
