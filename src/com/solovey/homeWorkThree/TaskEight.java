package com.solovey.homeWorkThree;

/*
Пользователь вводит с клавиатуры два числа (начало и
конец диапазона). Требуется проанализировать все числа
в этом диапазоне. Вывод на экран должен проходить по
правилам, указанным ниже.
Если число кратно 3 (делится на 3 без остатка) нужно
вывести слово «Fizz». Если число кратно 5 нужно вывести
слово «Buzz». Если число кратно 3 и 5 нужно вывести
«Fizz Buzz». Если число не кратно не 3 и 5 нужно вывести
само число.
 */

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int numberTwo = scanner.nextInt();
        if (numberOne < numberTwo) {
            for (int i = numberOne; i <= numberTwo; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Fizz Buzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Ошибка! Введите правильно диапазон!");
        }
    }
}
