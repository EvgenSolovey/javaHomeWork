package com.solovey.homeWorkThree;

/*
Пользователь вводит с клавиатуры длину линии.
Нужно отобразить на экране горизонтальную линию из *,
указанной длины.
Например, если было введено 7, тогда вывод на экран
будет такой:
*******
 */

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину линии: ");
        int length = scanner.nextInt();
        if (length >= 1) {
            for (int i = 1; i <= length; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("Ошибка! Введите правилно длину линии!");
        }
    }
}
