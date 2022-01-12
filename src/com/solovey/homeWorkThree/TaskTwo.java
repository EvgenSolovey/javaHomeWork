package com.solovey.homeWorkThree;

/*
Пользователь вводит с клавиатуры два числа. Нужно
показать все четные числа в указанном диапазоне.
 */

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int numberTwo = scanner.nextInt();
        if (numberOne < numberTwo) {
            System.out.print("Чётные числа в указанном диапазоне: ");
            for (int i = numberOne; i <= numberTwo; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Ошибка! Введите правильно диапазон!");
        }
    }
}
