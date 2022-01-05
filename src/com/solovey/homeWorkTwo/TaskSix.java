package com.solovey.homeWorkTwo;

/*
Пользователь вводит с клавиатуры целое шестизначное число.
Написать программу, которая определяет,
является ли введенное число — счастливым (Счастливым
считается шестизначное число, у которого сумма первых
3 цифр равна сумме вторых трех цифр).
Например, 123321 — счастливое число, так как 1 +
2 + 3 = 3 + 2 + 1.
С другой стороны 378423 несчастливое число, так как
3 + 7 + 8 ! = 4 + 2 + 3.
Если пользователь ввел не шестизначное число требуется
вывести сообщение об ошибке.
 */

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое шестизначное число: ");
        int compositeNumber = scanner.nextInt();
        if (compositeNumber >= 100000 && compositeNumber <= 999999) {
            int numberOne = compositeNumber % 10;
            int numberTwo = (compositeNumber / 10) % 10;
            int numberThree = (compositeNumber / 100) % 10;
            int numberFour = (compositeNumber / 1000) % 10;
            int numberFive = (compositeNumber / 10000) % 10;
            int numberSix = (compositeNumber / 100000) % 10;
            int sumFirstThreeNumbers = numberOne + numberTwo + numberThree;
            int sumSecondThreeNumbers = numberFour + numberFive + numberSix;
            if (sumFirstThreeNumbers == sumSecondThreeNumbers) {
                System.out.println("Счастливое число!");
            } else {
                System.out.println("Не счастливое число!");
            }
        } else {
            System.out.println("Ошибка! Не шестизначное число!");
        }
    }
}

