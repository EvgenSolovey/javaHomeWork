package com.solovey.homeWorkSix;

/*
Напишите метод, который проверяет является ли число
простым. Число передаётся в качестве параметра. Если
число простое нужно вернуть из метода true, иначе false
 */

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (primeNumber(number)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // Простое число - это натуральное число, большее 1, которое делится только на 1 и само на себя без остатка
    static boolean primeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}










