package com.solovey.homeWorkFive;

/*
Напишите программу, которая создает двухмерный
массив и заполняет его по следующему принципу:
пользователь вводит число (например, 8) первый элемент
массива принимает значение этого числа, последующий
элемент массива принимает значение этого числа +7
(т.е. 15 для нашего примера),
третий элемент массива предыдущий элемент +7
(т.е. 22 для нашего примера).
Созданный массив вывести на экран.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк в двумерном массиве: ");
        int quantityString = scanner.nextInt();
        System.out.println("Введите количество столбцов в двумерном массиве: ");
        int quantityColumn = scanner.nextInt();
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int[][] array = new int[quantityString][quantityColumn];
        for (int i = 0; i < quantityString; i++) {
            for (int j = 0; j < quantityColumn; j++) {
                array[i][j] = number;
                number += 7;
            }
        }
        System.out.println("Элементы двумерного массива: " + Arrays.deepToString(array));
    }
}
