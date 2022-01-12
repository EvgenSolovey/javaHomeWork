package com.solovey.homeWorkThree;

/*
Пользователь вводит с клавиатуры длину и ширину
прямоугольника. Требуется отобразить на экран незаполненный прямоугольник
(отображаются только границы прямоугольника).
Размер длины и ширины равен
введенным данным.
 */

import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника: ");
        int length = scanner.nextInt();
        System.out.println("Введите ширину прямоугольника: ");
        int width = scanner.nextInt();
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == length || j == 1 || j == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

