package com.solovey.homeWorkSix;

/*
Напишите метод для нахождения максимума в массиве.
Массив передаётся в качестве параметра.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskNine {
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
        maxElementArray(array);
    }

    // метод для нахождения максимума в массиве
    static void maxElementArray(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (max < element) {
                max = element;
            }
        }
        System.out.println("Максимальный элемент массива: " + max);
    }
}

