package com.solovey.homeWorkFive;

/*
Есть одномерный массив из 10 элементов,
заполненный случайными числами.
Необходимо найти число,
введенное пользователем.
Используйте алгоритм бинарного поиска.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        System.out.println("Массив случайных чисел:" + Arrays.toString(array));
        // Перед использованием алгоритма бинарного поиска отсортируем массив в порядке возрастания,
        // в противном случае результат будет неправильным.
        // Для сортировки массива используем класс Arrays метод sort(), по умолчанию сортируется в порядке возрастания
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число из массива для поиска: ");
        int number = scanner.nextInt();
        System.out.println("Число: " + number + " находится под индексом " + binarySearch(array, number));
    }

    // Метод бинарного поиска
    private static int binarySearch(int[] array, int number) {
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




