package com.solovey.homeWorkOne;

/*
Напишите программу, вычисляющую площадь треугольника.
Пользователь с клавиатуры вводит размер
основания треугольника и размер высоты.

 */

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер основания: ");
        double baseSide = scanner.nextDouble();
        System.out.println("Введите размер высоты: ");
        double height = scanner.nextDouble();
        double areaTriangle = (baseSide * height) / 2;
        System.out.println("Площадь треугольника равна: " + areaTriangle);
    }
}
