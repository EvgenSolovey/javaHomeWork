package com.solovey.homeWorkThree;

/*
Пользователь вводит с клавиатуры длину линии и символ для заполнения линии.
Нужно отобразить на экране
вертикальную линию из введенного символа,
указанной длины.
Например, если было введено 5 и символ %, тогда
вывод на экран будет такой:
%
%
%
%
%
 */

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину линии: ");
        int length = scanner.nextInt();
        System.out.println("Введите символ: ");
        char symbol = scanner.next().charAt(0);
        if (length >= 1) {
            for (int i = 1; i <= length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Ошибка! Введите правилно длину линии!");
        }
    }
}
