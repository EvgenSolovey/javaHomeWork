package com.solovey.homeWorkEight.taskOne;

/*
Создайте класс для подсчета площади геометрических фигур. Класс должен предоставлять функциональность
для подсчета площади треугольника по разным формулам, площади прямоугольника, площади квадрата,
площади ромба. Методы класса для подсчета площади должны быть реализованы с помощью статических
методов. Также класс должен считать количество подсчетов площади и возвращать это значение с помощью
статического метода.
 */

public class AreaFigure {
    public static int count = 0; // счетчик

    public static int count() { // метод считает количество подсчетов площади
        return count++;
    }

    // Площадь треугольника через основание и высоту
    public static double areaTriangle(int sideA, int height) {
        count();
        return 0.5 * sideA * height;
    }

    // Площадь треугольника через две стороны и угол между ними
    public static double areaTriangle(int sideA, int sideB, double angleAlpha) {
        count();
        return 0.5 * sideA * sideB * Math.sin(Math.toRadians(angleAlpha));
    }

    // Площадь треугольника через сторону и два прилежащих угла
    public static double areaTriangle(int sideA, double angleAlpha, double angleBeta) {
        count();
        double gama = 180 - (angleAlpha + angleBeta);
        return Math.pow(sideA, 2) / 2 * Math.sin(Math.toRadians(angleAlpha)) * Math.sin(Math.toRadians(angleBeta))
                / Math.sin(Math.toRadians(gama));
    }

    // Площадь треугольника по формуле Герона
    public static double areaTriangle(int sideA, int sideB, int sideC) {
        count();
        int p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    // Площадь прямоугольного треугольника через гипотенузу и острый угол
    public static double areaTriangle(int sideC, double angleAlpha) {
        count();
        return 0.25 * Math.pow(sideC, 2) * Math.sin(Math.toRadians(2 * angleAlpha));
    }

    // Площадь равностороннего треугольника через сторону
    public static double areaTriangle(int sideA) {
        count();
        return (Math.sqrt(3) * Math.pow(sideA, 2)) / 4;
    }

    // Площадь прямоугольника
    public static double areaRectangle(int sideA, int sideB) {
        count();
        return sideA * sideB;
    }

    // Площадь квадрата
    public static double areaSquare(int sideA) {
        count();
        return Math.pow(sideA, 2);
    }

    // Площадь ромба через сторону и высоту
    public static double areaRhombus(int sideA, int height) {
        count();
        return sideA * height;
    }
}


