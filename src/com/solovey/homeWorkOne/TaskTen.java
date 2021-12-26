package com.solovey.homeWorkOne;

/*
Пользователь с клавиатуры вводит четырёхзначное
число. Необходимо перевернуть число и отобразить
результат. Например, если введено 4512, результат 2154.
 */

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        String stringNumber = String.valueOf(number);
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < stringNumber.length(); i++) {
            resultString.insert(0, stringNumber.charAt(i));
        }
        int resultNumber = Integer.parseInt(resultString.toString());
        System.out.println("Перевёрнутое значение: " + resultNumber);
    }
}
