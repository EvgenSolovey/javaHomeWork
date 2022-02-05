package com.solovey.homeWorkFive;

/*
Есть одномерный массив из 15 элементов, заполненный
случайными числами. Необходимо первые 7 элементов
отсортировать по возрастанию, оставшиеся 8 элементов
по убыванию.
Выбор алгоритма сортировки необходимо
обосновать вашему преподавателю.
 */

import java.util.Arrays;
import java.util.Random;

public class TaskThree {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        System.out.println("Массив случайных чисел: " + Arrays.toString(array));
        // Сортировка выбором
        // По очереди просматриваем элементы массива
        for (int i = 0; i < 7; i++) {
            // Предполагаем, что первый элемент является минимальным
            int min = array[i];
            int minIndex = i;
            // В оставшейся части ищем элемент, который меньше предположенного минимума
            for (int j = i + 1; j < 7; j++) {
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
        System.out.println("Первые 7 элементов отсортировали по возрастанию: " + Arrays.toString(array));
        // Сортировка выбором
        for (int i = 7; i < array.length; i++) {
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
        System.out.println("Оставшиеся 8 элементов отсортировали по убыванию: " + Arrays.toString(array));
    }
}


