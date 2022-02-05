package com.solovey.homeWorkFour;

/*
В одномерном массиве, заполненном случайными
числами вычислить:
- Сумму отрицательных чисел;
- Сумму четных чисел;
- Сумму нечетных чисел;
- Произведение элементов с индексами кратными 3;
- Произведение элементов между минимальным и максимальным элементом;
- Найти первый и последний положительные элементы.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskNine {
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

        // Вычисляем сумму отрицательных чисел
        int sumNegativeNumbers = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                sumNegativeNumbers += array[i];
            }
        }
        System.out.println("Сумма отрицательных чисел: " + sumNegativeNumbers);

        // Вычисляем сумму четных чисел
        int sumEvenNumbers = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                sumEvenNumbers += array[i];
            }
        }
        System.out.println("Сумма четных чисел: " + sumEvenNumbers);

        // Вычисляем сумму нечетных чисел
        int sumOddNumbers = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                sumOddNumbers += array[i];
            }
        }
        System.out.println("Сумма нечетных чисел: " + sumOddNumbers);

        // Вычисляем произведение элементов с индексами кратными 3
        int multiplicationOne = 1;
        int multiplicationTwo = 1;
        for (int i = 3; i < size; i += 3) {
            multiplicationOne *= array[i];
        }
        System.out.println("Произведение элементов с индексами кратными 3: " + multiplicationOne);

        // Вычисляем произведение элементов между минимальным и максимальным элементом
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] >= array[indexOfMax])
                indexOfMax = i;
            else if (array[i] < array[indexOfMin])
                indexOfMin = i;
        }
        for (int i = Math.min(indexOfMax, indexOfMin) + 1; i < Math.max(indexOfMax, indexOfMin); i++) {
            // класс Math - предоставляет набор статических методов
            // для осуществления ряда различных математических вычислений
            // методы min, max - позволяют определить минимальный и максимальный элементы
            multiplicationTwo *= array[i];
        }
        System.out.println("Произведение элементов между минимальным и максимальным элементом: " + multiplicationTwo);

        // Находим первый и последний положительные элемент
        int first = 0;
        int last = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                first = array[i];
                break;
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            if (array[i] > 0) {
                last = array[i];
                break;
            }
        }
        System.out.println("Первое положительное число: " + first);
        System.out.println("Последнее положительное число: " + last);
    }
}










