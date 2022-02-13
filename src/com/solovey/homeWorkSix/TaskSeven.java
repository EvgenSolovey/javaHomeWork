package com.solovey.homeWorkSix;

/*
Напишите метод, который проверяет является ли
шестизначное число «счастливым». Число передаётся
в качестве параметра. Если число счастливое нужно вернуть из метода true, иначе false.
«Счастливое шестизначное число» — это число у которого сумма первых трёх цифр равна сумме трёх вторых
цифр. Например, 123420 — счастливое 1+2+3 = 4+2+0,
а 723422 — несчастливое 7+2+3 != 4+2+2.
 */

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (luckyNumber(number)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean luckyNumber(int number) {
        if (number >= 100000 && number <= 999999) {
            int numberOne = number % 10;
            int numberTwo = (number / 10) % 10;
            int numberThree = (number / 100) % 10;
            int numberFour = (number / 1000) % 10;
            int numberFive = (number / 10000) % 10;
            int numberSix = (number / 100000) % 10;
            int sumFirstThreeNumbers = numberOne + numberTwo + numberThree;
            int sumSecondThreeNumbers = numberFour + numberFive + numberSix;
            return sumFirstThreeNumbers == sumSecondThreeNumbers;
        }
        return false;
    }
}


