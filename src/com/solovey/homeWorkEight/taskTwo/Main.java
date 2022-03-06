package com.solovey.homeWorkEight.taskTwo;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый аргумент: ");
        double numberOne = scanner.nextDouble();
        System.out.println("Введите второй аргумент: ");
        double numberTwo = scanner.nextDouble();
        System.out.println("Введите третий аргумент: ");
        double numberThree = scanner.nextDouble();
        System.out.println("Введите четвертый аргумент: ");
        double numberFour = scanner.nextDouble();

        double max = Counter.max(numberOne, numberTwo, numberThree, numberFour);
        double min = Counter.min(numberOne, numberTwo, numberThree, numberFour);
        double averageValue = Counter.averageValue(numberOne, numberTwo, numberThree, numberFour);
        BigInteger factorialOne = Counter.factorial(numberOne);
        BigInteger factorialTwo = Counter.factorial((numberTwo));
        BigInteger factorialThree = Counter.factorial(numberThree);
        BigInteger factorialFour = Counter.factorial((numberFour));

        System.out.println("Максимум из четырех аргументов: " + max);
        System.out.println("Минимум из четырех аргументов: " + min);
        System.out.println("Среднеарифметическое из четырех аргументов: " + averageValue);
        System.out.println("Факториал первого аргумента: " + factorialOne);
        System.out.println("Факториал второго аргумента: " + factorialTwo);
        System.out.println("Факториал третьего аргумента: " + factorialThree);
        System.out.println("Факториал четвертого аргумента: " + factorialFour);
    }
}
