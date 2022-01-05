package com.solovey.homeWorkTwo;

/*
Пользователь вводит с клавиатуры три числа.
В зависимости от выбора пользователя программа выводит
на экран максимум из трёх, минимум из трёх или среднеарифметическое трёх чисел.
 */

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double numberOne = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double numberTwo = scanner.nextDouble();
        System.out.println("Введите третье число: ");
        double numberThree = scanner.nextDouble();
        System.out.println("Введите 'max' - если хотите увидеть максимальное зничение чисел;");
        System.out.println("Введите 'min' - если хотите увидеть минимальное зничение чисел;");
        System.out.println("Введите 'average' - если хотите увидеть среднеарифметическое зничение чисел");
        String str = scanner.next();
        if (str.equals("max")) {
            if (numberOne > numberTwo && numberOne > numberThree) {
                System.out.println("Максимальное значение: " + numberOne);
            } else if (numberTwo > numberThree) {
                System.out.println("Максимальное значение: " + numberTwo);
            } else {
                System.out.println("Максимальное значение " + numberThree);
            }
        }
        if (str.equals("min")) {
            if (numberOne < numberTwo && numberOne < numberThree) {
                System.out.println("Минимальное значение: " + numberOne);
            } else if (numberTwo < numberThree) {
                System.out.println("Минимальное значение: " + numberTwo);
            } else {
                System.out.println("Минимальное значение " + numberThree);
            }
        }
        if (str.equals("average")) {
            double average = (numberOne + numberTwo + numberThree) / 3;
            System.out.println("Среднеарифметическое зничение: " + average);
        }
    }
}


