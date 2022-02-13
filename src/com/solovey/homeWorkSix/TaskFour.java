package com.solovey.homeWorkSix;

/*
Напишите метод, который возвращает максимальное
из четырёх чисел. Числа передаются в качестве параметров.
 */

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int numberTwo = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int numberThree = scanner.nextInt();
        System.out.println("Введите четвёртое число: ");
        int numberFour = scanner.nextInt();
        maxNumbers(numberOne, numberTwo, numberThree, numberFour);
    }

    static void maxNumbers(int numberOne, int numberTwo, int numberThree, int numberFour) {
        if (numberOne > numberTwo && numberOne > numberThree && numberOne > numberFour) {
            System.out.println("Максимальное значение: " + numberOne);
        } else if (numberTwo > numberThree && numberTwo > numberFour) {
            System.out.println("Максимальное значение: " + numberTwo);
        } else if (numberThree > numberFour) {
            System.out.println("Максимальное значение:" + numberThree);
        } else {
            System.out.println("Максимальное значение " + numberFour);
        }
    }
}

