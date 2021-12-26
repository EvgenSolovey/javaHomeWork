package com.solovey.homeWorkOne;

/*
Пользователь вводит с клавиатуры два числа.
Необходимо найти сумму чисел, разницу чисел, произведение
чисел. Результат вычислений вывести на экран.
 */

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double numberOne = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double numberTwo = scanner.nextDouble();
        double sum = numberOne + numberTwo;
        double difference = numberOne - numberTwo;
        double multiplication = numberOne * numberTwo;
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Разница чисел: " + difference);
        System.out.println("Произведение чисел: " + multiplication);
    }
}

