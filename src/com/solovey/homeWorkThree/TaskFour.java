package com.solovey.homeWorkThree;

/*
Пользователь вводит с клавиатуры два числа. Нужно
посчитать сумму чисел в указанном диапазоне, а также
среднеарифметическое.
 */

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int numberTwo = scanner.nextInt();
        int sum = 0;
        int count = 0;
        if (numberOne < numberTwo) {
            for (int i = numberOne; i <= numberTwo; i++) {
                sum += i;
                count++;
            }
            double averageValues = (double) sum / count;
            System.out.println("Сумма чисел в указанном диапазоне: " + sum);
            System.out.println("Среднеарифметическое значение диапазона: " + averageValues);
        } else {
            System.out.println("Ошибка! Введите правильно диапазон!");
        }
    }
}
