package com.solovey.homeWorkFour;

/*
Пользователь вводит с клавиатуры строку и слово
для поиска. Посчитайте сколько раз в строке встречается
искомое слово. Полученное число выведите на экран.
 */

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        System.out.println("Введите слово для поиска: ");
        String word = scanner.nextLine();
        int count = 0;
        String[] array = str.split(" "); // разделили строку на подстроки по пробелу
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i].equalsIgnoreCase(word)) {
                count++;
            }
        }
        System.out.println("Слово " + "'" + word + "'" + " встречается в строке " + count + " раз.");
    }
}

