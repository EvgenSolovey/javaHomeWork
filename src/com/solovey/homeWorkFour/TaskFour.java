package com.solovey.homeWorkFour;

/*
Пользователь вводит с клавиатуры строку. Проверьте
является ли введенная строка палиндромом.
Палиндром — слово или текст, которое читается одинаково
слева направо и справа налево. Например, кок;
А роза упала на лапу Азора; доход; А буду я у дуба.
 */

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        String registerStr = str.toLowerCase()
                .replaceAll(" ", ""); // преобразовали в нижний регистр, удалили пробелы
        char[] array = registerStr.toCharArray();
        String resultStr = "";
        for (int i = array.length - 1; i >= 0; i--) {
            resultStr += array[i];
        }
        if (resultStr.equalsIgnoreCase(registerStr)) {
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
    }
}

