package com.solovey.homeWorkSix;

/*
Напишите метод, который ищет некоторое число
в массиве с помощью двоичного поиска.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskThirteen {
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
        // Перед использованием алгоритма двоисного поиска отсортируем массив в порядке возрастания,
        // в противном случае результат будет неправильным.
        // Для сортировки массива используем класс Arrays метод sort(), по умолчанию сортируется в порядке возрастания
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
        System.out.println("Введите число из массива для поиска: ");
        int number = scanner.nextInt();
        System.out.println("Число: " + number + " находится под индексом " + binarySearch(array, number));
    }

    // Метод двоичного поиска
    static int binarySearch(int[] array, int number) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = low + (high) - low / 2;
            // Если элемент меньше среднего, то он может присутствовать только в левом подмассиве
            if (number < array[middle]) {
                high = middle - 1;
                // Если элемент больше среднего, то он может присутствовать только в правом подмассиве
            } else if (number > array[middle]) {
                low = middle + 1;
                // Если элемент присутствует в середине
            } else {
                return middle;
            }
        }
        // Если элемент отсутствует
        return -1;
    }
}

