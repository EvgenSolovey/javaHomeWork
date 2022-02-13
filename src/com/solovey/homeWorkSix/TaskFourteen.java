package com.solovey.homeWorkSix;

/*
Напишите метод, высчитывающий
факториал каждого элемента массива.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskFourteen {
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
        factorial(array);
    }

    // метод высчитывающий факториал каждого элемента массива
    static void factorial(int[] array) {
        for (int element : array) {
            long multiplication = 1; // long позволяет вычислить факториал числа со значением не более 20
            for (int i = 1; i <= element; i++) {
                multiplication *= i;
            }
            System.out.println("Факториал числа: " + element + " равен: " + multiplication);
        }
    }
}
















