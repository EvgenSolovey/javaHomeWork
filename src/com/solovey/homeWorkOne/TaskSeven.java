package com.solovey.homeWorkOne;

/*
Пользователь вводит с клавиатуры число, состоящее
из четырех цифр. Требуется найти произведение цифр.
Например, если с клавиатуры введено 1324,
тогда результат произведения 1*3*2*4 = 24.
 */

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int compositeNumber = scanner.nextInt();
        int numberOne = compositeNumber % 10;
        int numberTwo = (compositeNumber / 10) % 10;
        int numberThree = (compositeNumber / 100) % 10;
        int numberFour = compositeNumber / 1000;
        int multiplication = numberOne * numberTwo * numberThree * numberFour;
        System.out.println("Произведение цифр введённого числа: " + multiplication);
    }
}

