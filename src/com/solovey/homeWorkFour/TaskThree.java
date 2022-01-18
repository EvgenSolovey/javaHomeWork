package com.solovey.homeWorkFour;

/*
Пользователь вводит с клавиатуры строку, слово для
поиска, слово для замены. Произведите в строке замену
одного слова на другое. Полученную строку отобразите
на экране.
 */

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        System.out.println("Введите слово для поиска: ");
        String word = scanner.nextLine();
        System.out.println("Введите слово для замены: ");
        String wordReplaceable = scanner.nextLine();
        String registerStr = str.toLowerCase(); // преобразовали в нижний регистр
        String[] array = registerStr.split(" "); // разделили строку на подстроки по пробелу
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i].equalsIgnoreCase(word)) {
                registerStr = registerStr.replaceAll(word, wordReplaceable);
            }
        }
        System.out.println(registerStr);
    }
}
