package com.solovey.homeWorkOne;

/*
Пользователь вводит с клавиатуры три цифры.
Необходимо создать число, содержащее эти цифры. Например,
если с клавиатуры введено 7, 3, 8, тогда нужно сформировать число 738.
 */

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int numberTwo = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int numberThree = scanner.nextInt();
        String stringNumberOne = String.valueOf(numberOne);
        String stringNumberTwo = String.valueOf(numberTwo);
        String stringNumberThree = String.valueOf(numberThree);
        String stringNumber = stringNumberOne + stringNumberTwo + stringNumberThree;
        int number = Integer.parseInt(stringNumber);
        System.out.println("Сформировалось число: " + number);
    }
}
