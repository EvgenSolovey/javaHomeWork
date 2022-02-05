package com.solovey.homeWorkFive;

/*
Два одномерных массива заполняются случайными
числами. Необходимо:
- Сформировать третий массив, содержащий элементы
обоих массивов;
- Сформировать третий массив, содержащий элементы
обоих массивов без повторений;
- Сформировать третий массив, содержащий только
минимальное и максимальное значение каждого из
массивов.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер первого массива: ");
        int sizeOne = scanner.nextInt();
        int[] arrayOne = new int[sizeOne];
        System.out.println("Введите размер второго массива: ");
        int sizeTwo = scanner.nextInt();
        int[] arrayTwo = new int[sizeTwo];
        Random random = new Random();
        for (int i = 0; i < sizeOne; i++) {
            arrayOne[i] = random.nextInt();
        }
        System.out.println("Первый массив случайных чисел: " + Arrays.toString(arrayOne));
        for (int i = 0; i < sizeTwo; i++) {
            arrayTwo[i] = random.nextInt();
        }
        System.out.println("Второй массив случайных чисел: " + Arrays.toString(arrayTwo));

        // Создаём третий массив, содержащий элементы обоих массивов
        int[] arrayThree = new int[sizeOne + sizeTwo]; //создаем третий массив
        int count = 0;
        for (int i = 0; i < sizeOne; i++) {
            arrayThree[i] = arrayOne[i];
            count++;
        }
        for (int i = 0; i < sizeTwo; i++) {
            arrayThree[count++] = arrayTwo[i];
        }
        System.out.println("Третий массив, содержащий элементы обоих массивов: " + Arrays.toString(arrayThree));

        // Создаём третий массив, содержащий элементы обоих массивов без повторений
        int countRepetitions = 0;
        for (int i = 0; i < arrayThree.length; i++) {
            for (int j = i + 1; j < arrayThree.length; j++) {
                if (arrayThree[i] == arrayThree[j])
                    countRepetitions++; // считаем количество повторений элементов
            }
        }
        int[] arrayNoRepetitions = new int[arrayThree.length - countRepetitions];
        arrayNoRepetitions[0] = arrayThree[0];
        int completion = 1;
        for (int i = 1; i < arrayThree.length; i++) {
            boolean check = true;
            for (int j = 0; j <= completion; j++) {
                if (arrayThree[i] == arrayNoRepetitions[j]) {
                    check = false;
                    break;
                }
            }
            if (check)
                arrayNoRepetitions[completion++] = arrayThree[i];
        }
        System.out.println("Третий массив, содержащий элементы обоих массивов без повторений: "
                + Arrays.toString(arrayNoRepetitions));

        int maxOne = 0;
        int minOne = 0;
        int maxTwo = 0;
        int minTwo = 0;
        // находим минимальное и максимальное значение первого массива
        for (int i = 1; i < arrayOne.length; i++) {
            if (arrayOne[i] > arrayOne[maxOne]) {
                maxOne = i;
            } else if (arrayOne[i] < arrayOne[minOne]) {
                minOne = i;
            }
        }
        // находим минимальное и максимальное значение второго массива
        for (int i = 1; i < arrayTwo.length; i++) {
            if (arrayTwo[i] > arrayTwo[maxTwo]) {
                maxTwo = i;
            } else if (arrayTwo[i] < arrayTwo[minTwo]) {
                minTwo = i;
            }
        }
        // Создаём третий массив, содержащий только минимальное и максимальное значение каждого из массивов
        int[] arrayMaxMim = new int[]{arrayOne[maxOne], arrayOne[minOne], arrayTwo[maxTwo], arrayTwo[minTwo]};
        for (int i = 0; i < arrayMaxMim.length; i++) {
            arrayThree = arrayMaxMim;
        }
        System.out.println("Tретий массив, содержащий только минимальное и максимальное значение каждого из массивов: "
                + Arrays.toString(arrayThree));
    }
}






