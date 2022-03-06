package com.solovey.homeWorkEight.taskTwo;

/*
Создайте класс для подсчета максимума из четырех аргументов, минимума из четырех аргументов, среднеарифметического из
четырех аргументов, факториала аргумента. Функциональность надо реализовать в виде статических методов.
 */

import java.math.BigInteger;

public class Counter {
    // Метод определяет максимальное значение
    public static double max(double numberOne, double numberTwo, double numberThree, double numberFour) {
        return Math.max(Math.max(numberOne, numberTwo), Math.max(numberThree, numberFour));
    }

    // Метод определяет минимальное значение
    public static double min(double numberOne, double numberTwo, double numberThree, double numberFour) {
        return Math.min(Math.min(numberOne, numberTwo), Math.min(numberThree, numberFour));
    }

    // Метод определяет среднеарифметическое значение
    public static double averageValue(double numberOne, double numberTwo, double numberThree, double numberFour) {
        return (numberOne + numberTwo + numberThree + numberFour) / 4;
    }

    // Метод определяет факториал числа
    public static BigInteger factorial(double number) {
        /* Класс BigInteger используется как аналог целочисленных значений произвольной длины,
        у которого нет ограничения в 64 битов, как например у long. */
        BigInteger bigInteger = BigInteger.ONE;
        for (int i = 1; i <= number; ++i) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }
}


