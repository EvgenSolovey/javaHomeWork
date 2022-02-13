package com.solovey.homeWorkSix;

/*
Напишите методы, определяющие количество чётных,
нечётных, положительных, отрицательных элементов
массива. Массив передаётся в качестве параметра.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int sizeArray = scanner.nextInt();
        System.out.println("Введите элементы массива: ");
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Полученный массив: " + Arrays.toString(array));
        countEvenNumbersArray(array);
        countOddNumbersArray(array);
        countPositiveNumbersArray(array);
        countNegativeNumbersArray(array);
    }

    // метод определяющий количество чётных элементов массива
    static void countEvenNumbersArray(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                count++;
            }
        }
        System.out.println("Количество чётных элементов массива: " + count);
    }

    // метод определяющий количество нечётных элементов массива
    static void countOddNumbersArray(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element % 2 != 0) {
                count++;
            }
        }
        System.out.println("Количество нечётных элементов массива: " + count);
    }

    // метод определяющий количество положительных элементов массива
    static void countPositiveNumbersArray(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element > 0) {
                count++;
            }
        }
        System.out.println("Количество положительных элементов массива: " + count);
    }

    // метод определяющий количество отрицательных элементов массива
    static void countNegativeNumbersArray(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element < 0) {
                count++;
            }
        }
        System.out.println("Количество отрицательных элементов массива: " + count);
    }
}

