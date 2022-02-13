package com.solovey.homeWorkSix;

/*
Напишите метод, который принимает два числа в качестве параметра
и отображает все четные числа между ними.
 */

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число диапазона: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число диапазона: ");
        int numberTwo = scanner.nextInt();
        evenNumbers(numberOne, numberTwo);
    }

    static void evenNumbers(int numberOne, int numberTwo) {
        if (numberOne < numberTwo) {
            for (int i = numberOne; i < numberTwo; i++) {
                if (i % 2 == 0 && i > numberOne) { // i > numberOne - не включая первое число из диапазона
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Ошибка! Введите правильно диапазон!");
        }
    }
}

