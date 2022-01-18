package com.solovey.homeWorkFour;

/*
Пользователь с клавиатуры вводит элементы
одномерного массива и некоторое число.
Необходимо посчитать
сколько раз данное число присутствует в массиве.
 */

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер масcива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы одномерного маccива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Введите некоторое число: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        System.out.println("Число: " + number + " присутствует в массиве " + count + " раз.");
    }
}

