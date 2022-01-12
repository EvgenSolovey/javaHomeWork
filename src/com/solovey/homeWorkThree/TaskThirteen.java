package com.solovey.homeWorkThree;

/*
Показать на экран таблицу умножения в диапазоне,
указанном пользователем. Например, если пользователь
указал 3 и 5, таблица может выглядеть так:
3 * 1 = 3  3 * 2 = 6  3 * 3 = 9 .... 3 * 10 = 30
.......................................
5 * 1 = 5  5 * 2 = 10  5 * 3 = 15 ...........
 */

import java.util.Scanner;

public class TaskThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число диапазона: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число диапазона: ");
        int numberTwo = scanner.nextInt();
        if (numberOne < numberTwo) {
            for (int i = numberOne; i <= numberTwo; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print(i + " * " + j + " = " + (i * j) + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Ошибка! Введите правильно диапазон!");
        }
    }
}
