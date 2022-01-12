package com.solovey.homeWorkThree;

 /*
Показать на экран все простые числа в диапазоне,
указанном пользователем. Число называется простым,
если оно делится без остатка только на себя и на единицу.
Например, три — это простое число, а четыре нет.
  */

import java.util.Scanner;

public class TaskTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число диапазона: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число диапазона: ");
        int numberTwo = scanner.nextInt();
        if (numberOne < numberTwo) {
            for (int i = numberOne; i <= numberTwo; i++) {
                boolean primeNumber = true;
                if (numberOne > 1) {
                    for (int j = numberOne; j < i; j++) {
                        if (i % j == 0) {
                            primeNumber = false;
                            break;
                        }
                    }
                    if (primeNumber) {
                        System.out.println("Простое число: " + i);
                    }
                } else {
                    System.out.println("Ошибка! Введите правильно диапазон!\n" +
                            "Простое число - это натуральное число, большее 1,\n" +
                            "которое делится только на 1 и само на себя.");
                    break;
                }
            }
        } else {
            System.out.println("Ошибка! Введите правильно диапазон!");
        }
    }
}
