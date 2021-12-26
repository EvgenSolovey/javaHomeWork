package com.solovey.homeWorkOne;

/*
Напишите программу, вычисляющую площадь квадрата.
Пользователь с клавиатуры вводит размер стороны
квадрата.
 */

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер стороны квадрата: ");
        double sideSize = scanner.nextDouble();
        double squareArea = Math.pow(sideSize, 2);
        System.out.println("Площадь квадрата равна: " + squareArea);
    }
}
