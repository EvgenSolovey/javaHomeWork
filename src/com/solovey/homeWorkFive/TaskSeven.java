package com.solovey.homeWorkFive;

/*
В двумерном массиве, заполненном случайными числами,
определить минимальный и максимальный элементы
для каждого столбца. Результаты вывести на экран.
 */

import java.util.Random;
import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество строк массива: ");
        int countStrings = scanner.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int countColumns = scanner.nextInt();
        int[][] array = new int[countStrings][countColumns];
        int[] arrayStrings = new int[countStrings];
        int[] arrayColumns = new int[countColumns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt();
                System.out.printf("%d\t", array[i][j]);
                // Метод printf() принадлежит классу PrintStream, который отвечает за вывод информации.
                // %d - целое десятичное число
                // \t - табуляции, т.е. отступит вправо
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            int min = array[0][i];
            int max = array[0][i];
            for (int j = 0; j < array[i].length; j++) {
                if (array[j][i] > max) {
                    max = array[j][i];
                }
                if (array[j][i] < min) {
                    min = array[j][i];
                }
            }
            arrayColumns[i] = max;
            arrayStrings[i] = min;
        }
        for (int p = 0; p < arrayColumns.length; p++) {
            System.out.println("Максимальный элемент столбца " + (p + 1) + ": " + arrayColumns[p]);
        }
        for (int k = 0; k < arrayStrings.length; k++) {
            System.out.println("Минимальный элемент столбца " + (k + 1) + ": " + arrayStrings[k]);
        }
    }
}


