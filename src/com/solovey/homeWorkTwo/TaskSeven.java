package com.solovey.homeWorkTwo;

/*
Пользователь вводит шестизначное число. Необходимо
поменять в этом числе первую и шестую цифры, а также
вторую и пятую цифры.
Например, 723895 должно превратиться в 593827.
Если пользователь ввел не шестизначное число требуется
вывести сообщение об ошибке.
 */

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначное число: ");
        int number = scanner.nextInt();
        if (number >= 100000 && number <= 999999) {
            String strOne = String.valueOf(number);
            strOne = strOne.substring(strOne.length() - 1) + strOne.substring(1, strOne.length() - 1) + strOne.charAt(0);
            String strTwo = strOne.charAt(0) + strOne.substring(4, strOne.length() - 1) +
                    strOne.substring(2, strOne.length() - 2) + strOne.charAt(1) + strOne.charAt(5);
            int numberInt = Integer.parseInt(strTwo);
            System.out.println(numberInt);
        } else {
            System.out.println("Ошибка! Не шестизначное число!");
        }
    }
}
