package com.solovey.homeWorkNine.taskFour;

public class Rectangle extends Figure {
    private final static String NAME = "прямоугольника";
    private double sideOne; // размер одной стороны
    private double sideTwo; // // размер второй стороны

    public Rectangle(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public String getNAME() {
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
        return sideOne * sideTwo; // Площадь прямоугольника через две стороны
    }
}
