package com.solovey.homeWorkFour;

/*
Пользователь вводит с клавиатуры строку.
Произведите поворот строк и полученный результат выведите
на экран.
 */

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        char[] array = str.toCharArray();
        String resultStr = "";
        for (int i = array.length - 1; i >= 0; i--) {
            resultStr += array[i];
        }
        System.out.println(resultStr);
    }
}
