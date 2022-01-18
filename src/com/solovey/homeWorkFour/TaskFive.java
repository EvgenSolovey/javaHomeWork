package com.solovey.homeWorkFour;

/*
Есть некоторый текст. Реализуйте следующую функциональность
- Изменить текст таким образом, чтобы каждое предложение начиналось с большой буквы;
- Посчитайте сколько раз цифры встречаются в тексте;
- Посчитайте сколько раз знаки препинания встречаются в тексте;
- Посчитайте количество предложений в тексте.
 */

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = scanner.nextLine();

        // Изменяем текст таким образом, чтобы каждое предложение начиналось с большой буквы
        // Считаем количество предложений в тексте
        String resultStr;
        String[] words = str.split("[.!?]\\s*");  // разделили строку на подстроки по знакам препинания [.!?]
        int countSentences = 0;
        for (String word : words) {
            resultStr = word.substring(0, 1).toUpperCase()
                    + word.substring(1); // поменяли первые буквы в предложениях на большие буквы
            countSentences++;
            System.out.println(resultStr);
        }
        System.out.println("Количество предложений в тексте: " + countSentences);

        // Считаем сколько раз цифры встречаются в тексте
        int countNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 48 && str.charAt(i) < 57) {
                // сначала строка преобразуется в число,
                // затем полученное число преобразуется в символ (по коду ASCII), и в конце - проверка,
                // является ли этот символ цифрой от '0' до '9', т.е. попадает ли число, в которое преобразована строка,
                // в диапазон от 48 до 57
                countNumber++;
            }
        }
        System.out.println("Количество цифр встречающиеся в тексте: " + countNumber);

        // Считаем сколько раз знаки препинания встречаются в тексте
        int countPunctuationMarks = 0;
        char[] punctuationMarks = {'.', ',', '-', ':', ';', '?', '!'}; // массив знаков препинания
        char[] charsStr = str.toCharArray();
        for (char c : charsStr) {
            for (char punctuationMark : punctuationMarks) {
                if (c == punctuationMark) {
                    countPunctuationMarks++;
                }
            }
        }
        System.out.println("Количество знаков препинания встречающиеся в тексте: " + countPunctuationMarks);
    }
}



