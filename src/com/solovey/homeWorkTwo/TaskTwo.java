package com.solovey.homeWorkTwo;

/*
Пользователь вводит с клавиатуры три числа.
В зависимости от выбора пользователя программа выводит
на экран сумму трёх чисел или произведение трёх чисел.
 */

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double numberOne = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double numberTwo = scanner.nextDouble();
        System.out.println("Введите третье число: ");
        double numberThree = scanner.nextDouble();
        System.out.println("Введите '+' - если хотите посчитать сумму чисел;");
        System.out.println("Введите '*' - если хотите посчитать произведение чисел");
        char symbol = scanner.next().charAt(0);
        if (symbol == '+') {
            double sum = numberOne + numberTwo + numberThree;
            System.out.println("Сумма чисел: " + sum);
        }
        if (symbol == '*') {
            double multiplication = numberOne * numberTwo * numberThree;
            System.out.println("Произведение чисел: " + multiplication);
        }
    }
}
