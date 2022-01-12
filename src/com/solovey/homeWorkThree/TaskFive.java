package com.solovey.homeWorkThree;

/*
Пользователь вводит с клавиатуры число. Требуется
посчитать факториал числа. Например, если введено 3,
факториал числа 1*2*3=6.
Формула для расчета факториала: n! = 1*2*3…*n, где
n — число для расчета факториала.
 */

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        long multiplication = 1; // long позволяет вычислить факториал числа со значением не более 20
        for (int i = 1; i <= number; i++) {
            multiplication *= i;
        }
        System.out.println("Факториал числа: " + multiplication);
    }
}
