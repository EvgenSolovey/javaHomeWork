package com.solovey.homeWorkOne;

/*
Пользователь вводит с клавиатуры количество метров.
Требуется вывести результат перевода метров в
сантиметры, дециметры, миллиметры, мили.
 */

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество метров: ");
        double metres = scanner.nextDouble();
        double centimeters = metres * 100;
        double decimeters = metres * 10;
        double millimeters = metres * 1000;
        double miles = metres * 0.000621371192237334; // в 1 метре 0.000621371192237334 миль
        System.out.println("Сантиметров: " + centimeters);
        System.out.println("Дециметров: " + decimeters);
        System.out.println("Миллиметров: " + millimeters);
        System.out.println("Мили: " + miles);
    }
}
