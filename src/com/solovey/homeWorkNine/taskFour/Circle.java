package com.solovey.homeWorkNine.taskFour;

public class Circle extends Figure {
    private final static String NAME = "круга";
    private double radius; // радиус круга

    public Circle(double radius) {
        this.radius = radius;
    }

    public static String getNAME() {
        return NAME;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String nameFigure() {
        return NAME;
    }

    @Override
    public double calculatingArea() {
        return Math.pow(radius, 2) * Math.PI; // Площадь круга через радиус
    }
}
