package com.solovey.homeWorkFour;

/*
Есть одномерный массив, заполненный случайными
числами. На основании данных этого массива нужно:
- Создать одномерный массив, содержащий только
четные числа из первого массива;
- Создать одномерный массив, содержащий только
нечетные числа из первого массива;
- Создать одномерный массив, содержащий только
отрицательные числа из первого массива;
- Создать одномерный массив, содержащий только
положительные числа из первого массива.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random(); // Класс Random - применяется для генерации случайных чисел
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        System.out.println("Случайные элементы массива: " + Arrays.toString(array));
        // Класс Arrays, метод toString(), который возвращает текстовое представление массива

        // Создаём одномерный массив, содержащий только четные числа из первого массива
        int j = 0;
        int countEven = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }
        int[] arrayEvenNumbers = new int[countEven];
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                arrayEvenNumbers[j++] = array[i];
            }
        }
        System.out.println("Массив содержащий четные числа из первого массива: " + Arrays.toString(arrayEvenNumbers));

        // Создаём одномерный массив, содержащий только нечетные числа из первого массива
        int k = 0;
        int countOdd = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                countOdd++;
            }
        }
        int[] arrayOddNumbers = new int[countOdd];
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                arrayOddNumbers[k++] = array[i];
            }
        }
        System.out.println("Массив содержащий нечетные числа из первого массива: " + Arrays.toString(arrayOddNumbers));

        // Создаём одномерный массив, содержащий только отрицательные числа из первого массива
        int l = 0;
        int countNegative = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                countNegative++;
            }
        }
        int[] arrayNegativeNumbers = new int[countNegative];
        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                arrayNegativeNumbers[l++] = array[i];
            }
        }
        System.out.println("Массив содержащий отрицательные числа из первого массива: " + Arrays.toString(arrayNegativeNumbers));

        // Создаём одномерный массив, содержащий только положительные числа из первого массива
        int m = 0;
        int countPositive = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                countPositive++;
            }
        }
        int[] arrayPositiveNumbers = new int[countPositive];
        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                arrayPositiveNumbers[m++] = array[i];
            }
        }
        System.out.println("Массив содержащий положительные числа из первого массива: " + Arrays.toString(arrayPositiveNumbers));
    }
}