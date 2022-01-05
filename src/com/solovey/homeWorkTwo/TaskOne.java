package com.solovey.homeWorkTwo;

/*
Пользователь вводит с клавиатуры число.
Необходимо проверить его на четность и нечетность. Если число
четное требуется вывести на экран число и надпись «Even
number». Если число нечетное выведите на экран число
и надпись «Odd number».
 */

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
