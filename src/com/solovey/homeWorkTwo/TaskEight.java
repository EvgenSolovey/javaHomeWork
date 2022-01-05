package com.solovey.homeWorkTwo;

/*
Пользователь вводит с клавиатуры номер месяца (от
1 до 12). В зависимости от полученного номера месяца
программа выводит на экран надпись: «Winter» (если введено значение 1,2 или 12),
«Spring» (если введено значение
от 3 до 5), «Summer» (если введено значение от 6 до 8),
«Autumn» (если введено значение от 9 до 11).
Если пользователь ввел значение не в диапазоне от
1 до 12 требуется вывести сообщение об ошибке.
 */

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            System.out.println("Winter");
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            System.out.println("Spring");
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("Summer");
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Ошибка! Введите правильный номер месяца!");
        }
    }
}
