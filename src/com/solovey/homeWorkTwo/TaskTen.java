package com.solovey.homeWorkTwo;

/*
Пользователь вводит с клавиатуры число в диапазоне
от 1 до 100. Если число кратно 3 (делится на 3 без остатка)
нужно вывести слово «Fizz». Если число кратно 5 нужно
вывести слово «Buzz». Если число кратно 3 и 5 нужно
вывести «Fizz Buzz». Если число не кратно не 3 и 5 нужно
вывести само число.
Если пользователь ввел значение не в диапазоне от
1 до 100 требуется вывести сообщение об ошибке.
 */

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в диапазоне от 1 до 100: ");
        int number = scanner.nextInt();
        if (number >= 1 && number <= 100) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            }
        } else {
            System.out.println("Ошибка! Введите число в диапазоне от 1 до 100!");
        }
    }
}
