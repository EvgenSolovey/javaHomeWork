package com.solovey.homeWorkFour;

/*
Пользователь с клавиатуры вводит элементы одномерного массива.
Необходимо найти сумму элементов
массива, среднеарифметическое, отобразить на экран все
элементы массива.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер масcива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int sum = 0;
        System.out.println("Введите элементы одномерного маccива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Элементы масcива: " + Arrays.toString(array));
        // Класс Arrays, метод toString(), который возвращает текстовое представление массива

        // Находим сумму элементов массива
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов массива: " + sum);

        // Находим среднеарифметическое элементов массива
        double averageValue = (double) sum / size;
        System.out.println("Среднеарифметическое элементов массива: " + averageValue);
    }
}
