package com.solovey.homeWorkNine.taskFour;

public class Trapezoid extends Figure {
    private final static String NAME = "трапеции";
    private double sideOne; // нижнее основание
    private double sideTwo; // верхнее основание
    private double sideHeight; // высота трапеции

    public Trapezoid(double sideOne, double sideTwo, double sideHeight) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideHeight = sideHeight;
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

    public double getSideHeight() {
        return sideHeight;
    }

    public void setSideHeight(double sideHeight) {
        this.sideHeight = sideHeight;
    }

    @Override
    public String nameFigure() {
        return NAME;
    }

    @Override
    public double calculatingArea() {
        return ((sideOne + sideTwo) / 2) * sideHeight; // Площадь трапеции по высоте и двум основаниям
    }
}
