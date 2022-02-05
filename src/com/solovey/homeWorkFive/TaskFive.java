package com.solovey.homeWorkFive;

/*
Пользователь с клавиатуры вводит элементы двумерного массива (3x3).
Необходимо найти сумму элементов
массива, среднеарифметическое, отобразить на экран все
элементы массива.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];
        System.out.println("Введите элементы двумерного массива: ");
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scanner.nextInt();
                sum += array[i][j]; // Сумма элементов массива
                count++; // Считаем количество элементов массива
            }
        }
        System.out.println("Элементы двумерного массива: " + Arrays.deepToString(array));
        // Метод deepToString() - Возвращает строковое представление указанного массива.
        // Если массив содержит другие массивы как элементы, строковое представление содержит их содержимое и так далее.
        // Этот метод предназначен для преобразования многомерных массивов в строки.
        System.out.println("Сумма элементов массива: " + sum);
        double averageValue = (double) sum / count; // Среднеарифметическое элементов массива
        System.out.println("Среднеарифметическое элементов массива: " + averageValue);
    }
}
