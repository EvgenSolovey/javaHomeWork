package com.solovey.homeWorkSix;

/*
Напишите метод, вычисляющий сумму элементов
массива. Массив передаётся в качестве параметра.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskEight {
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
        sumElementsArray(array);
    }

    // метод вычисляющий сумму элементов массива
    static void sumElementsArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}
