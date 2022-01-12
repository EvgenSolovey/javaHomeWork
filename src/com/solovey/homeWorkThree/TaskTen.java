package com.solovey.homeWorkThree;

/*
Пользователь вводит с клавиатуры размер стороны
квадрата. Требуется отобразить на экран незаполненный
квадрат (отображаются только границы квадрата). Размер
стороны равен введённому размеру.
 */

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер стороны квадрата: ");
        int sideSizeSquare = scanner.nextInt();
        for (int i = 1; i <= sideSizeSquare; i++) {
            for (int j = 1; j <= sideSizeSquare; j++) {
                if (i == 1 || i == sideSizeSquare || j == 1 || j == sideSizeSquare) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
