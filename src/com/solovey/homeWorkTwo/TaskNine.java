package com.solovey.homeWorkTwo;

/*
Пользователь вводит с клавиатуры номер месяца (от
1 до 12). В зависимости от полученного номера месяца
программа выводит название месяца.
Если пользователь ввел значение не в диапазоне от
1 до 12 требуется вывести сообщение об ошибке.
 */

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Ошибка! Введите правильный номер месяца!");
        }
    }
}
