package com.solovey.homeWorkTwo;

/*
Пользователь с клавиатуры вводит количество часов.
Если полученное значение находится в диапазоне от 0 до
6 нужно вывести надпись «Good Night», если в диапазоне
от 6 до 13 «Good Morning», если в диапазоне от 13 до 17
«Good Day», если в диапазоне от 17 до 0 «Good Evening».
Верхняя граница диапазона не включается. Например,
число 6 относится к 6 до 13.
 */

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество часов: ");
        double time = scanner.nextDouble();
        if (time >= 0 && time < 6) {
            System.out.println("Good Night");
        } else if (time >= 6 && time < 13) {
            System.out.println("Good Morning");
        } else if (time >= 13 && time < 17) {
            System.out.println("Good Day");
        } else if (time >= 17 && time <= 23) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Ошибка! Введите правильное количество часов!");
        }
    }
}
