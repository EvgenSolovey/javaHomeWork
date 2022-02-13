package com.solovey.homeWorkSix;

/*
Напишите метод, который отображает горизонтальную
или вертикальную линию из некоторого символа.
Метод принимает в качестве параметра: длину линии,
направление, символ.
 */

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину линии: ");
        int length = scanner.nextInt();
        System.out.println("Введите: 1 - горизонтально; 2 - вертикально");
        int direction = scanner.nextInt();
        System.out.println("Введите символ: ");
        char symbol = scanner.next().charAt(0);
        lineSymbols(length, direction, symbol);
    }

    static void lineSymbols(int length, int direction, char symbol) {
        if (length > 1) { // длина линии должна быть больше одного символа
            switch (direction) {
                case 1:
                    for (int i = 1; i <= length; i++) {
                        System.out.print(symbol);
                    }
                    break;
                case 2:
                    for (int i = 1; i <= length; i++) {
                        System.out.println(symbol);
                    }
                    break;
            }
        } else {
            System.out.println("Ошибка! Введите правильно длину линии!");
        }
    }
}






