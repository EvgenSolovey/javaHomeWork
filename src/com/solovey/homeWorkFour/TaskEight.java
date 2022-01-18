package com.solovey.homeWorkFour;

/*
В одномерном массиве, заполненном случайными
числами, определить минимальный и максимальный
элементы, посчитать количество отрицательных элементов,
посчитать количество положительных элементов,
посчитать количество нулей. Результаты вывести на
экран.
 */

import java.util.Random;
import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random(); // Класс Random - применяется для генерации случайных чисел
        System.out.print("Случайные элементы массива: ");
        for (int i = 0; i < size; i++) {
            System.out.print((array[i] = random.nextInt()) + " ");
        }
        System.out.println();

        // Определяем минимальный и максимальный элементы
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < size; i++) {
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
            // Класс Math - предоставляет набор статических методов
            // для осуществления ряда различных математических вычислений
            // методы min, max - позволяют определить минимальный и максимальный элементы
        }
        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Максимальное значение массива: " + max);

        // Считаем количество отрицательных и положительных элементов, количество нулей
        int countNegative = 0;
        int countPositive = 0;
        int countNull = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                countNegative++;
            } else if (array[i] > 0) {
                countPositive++;
            } else if (array[i] == 0) {
                countNull++;
            }
        }
        System.out.println("Количество отрицательных элементов: " + countNegative);
        System.out.println("Количество положительных элементов: " + countPositive);
        System.out.println("Количество нулей: " + countNull);
    }
}
