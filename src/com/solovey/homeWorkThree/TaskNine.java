package com.solovey.homeWorkThree;

/*
Пользователь вводит с клавиатуры размер стороны
квадрата. Требуется отобразить на экран заполненный
квадрат. Размер стороны равен введённому размеру.
Например, если пользователь ввёл 3 на экране будет выведено:
***
***
***
 */

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер стороны квадрата: ");
        int sideSizeSquare = scanner.nextInt();
        for (int i = 1; i <= sideSizeSquare; i++) {
            for (int j = 1; j <= sideSizeSquare; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
