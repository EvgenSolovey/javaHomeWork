package com.solovey.homeWorkSix;

/*
Напишите метод, переворачивающий
содержимое массива.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwelve {
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
        flippingContentsArray(array);
    }

    // метод переворачивающий содержимое массива
    static void flippingContentsArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = array.length - 1; i > 0; ) {
            for (int j = 0; j < array.length; j++) {
                newArray[j] = array[i];
                i--;
            }
        }
        System.out.println("Перевёрнутый массив: " + Arrays.toString(newArray));
    }
}
