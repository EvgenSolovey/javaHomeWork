package com.solovey.homeWorkFive;

/*
В двумерном массиве, заполненном случайными числами,
определить минимальный и максимальный элементы
для каждой строки. Результаты вывести на экран.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество строк массива: ");
        int countStrings = scanner.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int countColumns = scanner.nextInt();
        int[][] array = new int[countStrings][countColumns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt();
            }
        }
        System.out.println("Элементы двумерного массива: " + Arrays.deepToString(array));
        // Метод deepToString() - Возвращает строковое представление указанного массива.
        // Если массив содержит другие массивы как элементы, строковое представление содержит их содержимое и так далее.
        // Этот метод предназначен для преобразования многомерных массивов в строки.
        for (int i = 0; i < array.length; i++) {
            int min = array[i][0];
            int max = array[i][0];
            for (int j = 0; j < array.length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
            System.out.println("Строка: " + (i + 1) + ": Максимальный элемент: " + max + " Минимальный элемент: " + min);
        }
    }
}
