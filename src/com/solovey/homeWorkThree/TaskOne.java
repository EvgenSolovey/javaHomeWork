package com.solovey.homeWorkThree;

/*
Пользователь вводит с клавиатуры два числа. Нужно
показать все числа в указанном диапазоне.
 */

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int numberTwo = scanner.nextInt();
        if (numberOne < numberTwo) {
            System.out.print("Числа в указанном диапазоне: ");
            for (int i = numberOne; i <= numberTwo; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Ошибка! Введите правильно диапазон!");
        }
    }
}
