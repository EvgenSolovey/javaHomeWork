package com.solovey.homeWorkSix;

/*
Напишите метод, который разделит текст на предложении
 */

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = scanner.nextLine();
        formatText(str);
    }

    static void formatText(String str) {
        String[] words = str.split("[.!?]\\s*"); // разделили строку на подстроки по знакам препинания [.!?]
        for (String word : words) {
            System.out.println(word);
        }
    }
}
