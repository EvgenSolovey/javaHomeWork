package com.solovey.homeWorkSix;

/*
Напишите метод, который возвращает сумму чисел
в указанном диапазоне. Границы диапазона передаются
в качестве параметров.
 */

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число диапазона: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число диапазона: ");
        int numberTwo = scanner.nextInt();
        sumRangeNumbers(numberOne, numberTwo);
    }

    static void sumRangeNumbers(int numberOne, int numberTwo) {
        if (numberOne < numberTwo) {
            int sum = 0;
            for (int i = numberOne; i <= numberTwo; i++) {
                    sum += i;
                }
            System.out.println("Сумма чисел в указанном диапазоне: " + sum);
        } else {
            System.out.println("Ошибка! Введите правильно диапазон!");
        }
    }
}
