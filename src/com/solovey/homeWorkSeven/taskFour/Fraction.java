package com.solovey.homeWorkSeven.taskFour;

/*
Создайте класс Дробь. Необходимо хранить в полях
класса: числитель и знаменатель. Реализуйте методы класса
для ввода данных, вывода данных, реализуйте доступ
к отдельным полям через методы класса. Также создайте
методы класса для выполнения арифметических операций
(сложение, вычитание, умножение, деление).
 */

import java.util.Scanner;

public class Fraction {
    private int numeratorOne;
    private int denominatorOne;
    private int numeratorTwo;
    private int denominatorTwo;

    public Fraction(int numeratorOne, int denominatorOne, int numeratorTwo, int denominatorTwo) {
        this.numeratorOne = numeratorOne;
        this.denominatorOne = denominatorOne;
        this.numeratorTwo = numeratorTwo;
        this.denominatorTwo = denominatorTwo;
    }

    public int getNumeratorOne() {
        return numeratorOne;
    }

    public void setNumeratorOne(int numeratorOne) {
        this.numeratorOne = numeratorOne;
    }

    public int getDenominatorOne() {
        return denominatorOne;
    }

    public void setDenominatorOne(int denominatorOne) {
        this.denominatorOne = denominatorOne;
    }

    public int getNumeratorTwo() {
        return numeratorTwo;
    }

    public void setNumeratorTwo(int numeratorTwo) {
        this.numeratorTwo = numeratorTwo;
    }

    public int getDenominatorTwo() {
        return denominatorTwo;
    }

    public void setDenominatorTwo(int denominatorTwo) {
        this.denominatorTwo = denominatorTwo;
    }

    void dataOutput() {
        System.out.println("Числитель первой дроби: " + getNumeratorOne()
                + "; Знаменатель первой дроби: " + getDenominatorOne()
                + "; Числитель второй дроби: " + getNumeratorTwo()
                + "; Знаменатель второй дроби: " + getDenominatorTwo());
    }

    public void dataInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числитель первой дроби: ");
        setNumeratorOne(scanner.nextInt());
        System.out.println("Введите знаменатель первой дроби: ");
        setDenominatorOne(scanner.nextInt());
        System.out.println("Введите числитель второй дроби: ");
        setNumeratorTwo(scanner.nextInt());
        System.out.println("Введите знаменатель второй дроби: ");
        setDenominatorTwo(scanner.nextInt());
    }

    // метод подсчета суммы дробей
    public double sum(double numeratorOne, double denominatorOne, double numeratorTwo, double denominatorTwo) {
        return (numeratorOne / denominatorOne) + (numeratorTwo / denominatorTwo);
    }

    // метод подсчета разности дробей
    public double difference(double numeratorOne, double denominatorOne, double numeratorTwo, double denominatorTwo) {
        return (numeratorOne / denominatorOne) - (numeratorTwo / denominatorTwo);
    }

    // метод подсчета произведения дробей
    public double multiplication(double numeratorOne, double denominatorOne, double numeratorTwo, double denominatorTwo) {
        return (numeratorOne / denominatorOne) * (numeratorTwo / denominatorTwo);
    }

    // метод подсчета деления дробей
    public double division(double numeratorOne, double denominatorOne, double numeratorTwo, double denominatorTwo) {
        return (numeratorOne / denominatorOne) / (numeratorTwo / denominatorTwo);
    }
}






