package com.solovey.homeWorkSix;

/*
Напишите метод, сортирующий массив по убыванию
или возрастанию в зависимости от выбора
пользователя.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskEleven {
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
        System.out.println("Введите: 1 - сортировать массив по возрастанию; 2 - сортировать массив по убыванию");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                sortArrayIncreasing(array);
                break;
            case 2:
                sortArrayDecreasing(array);
                break;
        }
    }

    // метод сортирующий массив по возрастанию
    static void sortArrayIncreasing(int[] array) {
        // Сортировка выбором
        for (int i = 0; i < array.length; i++) {
            // Предполагаем, что первый элемент является минимальным
            int min = array[i];
            int minIndex = i;
            // В оставшейся части ищем элемент, который меньше предположенного минимума
            for (int j = i + 1; j < array.length; j++) {
                // Если находим, запоминаем его индекс
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            // Если нашелся элемент, меньший, чем на текущей позиции, меняем их местами
            if (i != minIndex) {
                int reserve = array[i];
                array[i] = array[minIndex];
                array[minIndex] = reserve;
            }
        }
        System.out.println("Отсортировали массив по возрастанию: " + Arrays.toString(array));
    }

    // метод сортирующий массив по убыванию
    static void sortArrayDecreasing(int[] array) {
        // Сортировка выбором
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int reserve = array[i];
                array[i] = array[minIndex];
                array[minIndex] = reserve;
            }
        }
        System.out.println("Отсортировали массив по убыванию: " + Arrays.toString(array));

    }
}


