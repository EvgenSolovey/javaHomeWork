package com.solovey.homeWorkOne;

/*
Пользователь вводит с клавиатуры два числа. Первое
число — это значение, второе число процент, который
необходимо посчитать. Например, мы ввели с клавиатуры
50 и 10. Требуется вывести на экран 10 процентов от 50.
Результат: 5.
 */

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number = scanner.nextDouble();
        System.out.println("Введите процент от числа: ");
        double percent = scanner.nextDouble();
        double result = (number * percent) / 100;
        System.out.println(percent + " % от числа " + number + " равно " + result);
    }
}