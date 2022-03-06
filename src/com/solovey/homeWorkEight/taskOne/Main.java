package com.solovey.homeWorkEight.taskOne;

public class Main {
    public static void main(String[] args) {
        double areaTriangleOne = AreaFigure.areaTriangle(15, 20);
        double areaTriangleTwo = AreaFigure.areaTriangle(15, 25, 30.0);
        double areaTriangleThree = AreaFigure.areaTriangle(15, 30.0, 45.0);
        double areaTriangleFour = AreaFigure.areaTriangle(15, 25, 20);
        double areaTriangleFive = AreaFigure.areaTriangle(25, 30.0);
        double areaTriangleSix = AreaFigure.areaTriangle(20);

        double areaRectangle = AreaFigure.areaRectangle(10, 20);

        double areaSquare = AreaFigure.areaSquare(15);

        double areaRhombus = AreaFigure.areaRhombus(25, 15);

        System.out.println("Площадь треугольника через основание и высоту: " + areaTriangleOne);
        System.out.println("Площадь треугольника через две стороны и угол между ними: " + areaTriangleTwo);
        System.out.println("Площадь треугольника через сторону и два прилежащих угла: " + areaTriangleThree);
        System.out.println("Площадь треугольника по формуле Герона: " + areaTriangleFour);
        System.out.println("Площадь прямоугольного треугольника через гипотенузу и острый угол: " + areaTriangleFive);
        System.out.println("Площадь равностороннего треугольника через сторону: " + areaTriangleSix);

        System.out.println("Площадь прямоугольника: " + areaRectangle);

        System.out.println("Площадь квадрата: " + areaSquare);

        System.out.println("Площадь ромба: " + areaRhombus);

        System.out.println("Количество подсчетов площади: " + AreaFigure.count());
    }
}

