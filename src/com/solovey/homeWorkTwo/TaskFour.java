package com.solovey.homeWorkTwo;

/*
Пользователь вводит с клавиатуры количество метров.
В зависимости от выбора пользователя программа
переводит метры в мили, дюймы или ярды.
 */

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество метров: ");
        double metres = scanner.nextDouble();
        System.out.println("Введите 'мили' - если хотите перевести в мили;");
        System.out.println("Введите 'дюймы' - если хотите перевести в дюймы;");
        System.out.println("Введите 'ярды' - если хотите перевести в ярды;");
        String str = scanner.next();
        if (str.equals("мили")) {
            double miles = metres * 0.000621371192237334; // в 1 метре 0.000621371192237334 миль
            System.out.println(miles + " миль");
        }
        if (str.equals("дюймы")) {
            double inches = metres * 39.37007874015748; // 1 метр это 39.37007874015748 дюймов
            System.out.println(inches + " дюймов");
        }
        if (str.equals("ярды")) {
            double yards = metres * 1.0936132983377078; // 1 метр это 1.0936132983377078 ярдов
            System.out.println(yards + " ярдов");
        }
    }
}

