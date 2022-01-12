package com.solovey.homeWorkThree;

/*
Пользователь вводит с клавиатуры два числа.
Нужно показать все нечетные числа в указанном диапазоне.
Если границы диапазона указаны неправильно требуется
произвести нормализацию границ. Например, пользователь ввел 20 и 11,
требуется нормализация после которой
начало диапазона станет равно 11, а конец 20.
 */

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int numberTwo = scanner.nextInt();
        System.out.print("Нечётные числа в указанном диапазоне: ");
        if (numberOne > numberTwo) {
            for (int i = numberTwo; i <= numberOne; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = numberOne; i <= numberTwo; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
