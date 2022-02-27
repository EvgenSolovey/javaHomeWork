package com.solovey.homeWorkSeven.taskFour;

public class Main {
    public static void main(String[] args) {
        Fraction fractionOne = new Fraction(1, 2, 3, 4);
        fractionOne.dataOutput();

        double resultSumOne = fractionOne.sum(1, 2, 3, 4);
        double resultDifferenceOne = fractionOne.difference(1, 2, 3,
                4);
        double resultMultiplicationOne = fractionOne.multiplication(1, 2, 3,
                4);
        double resultDivisionOne = fractionOne.division(1, 2, 3, 4);
        System.out.println("Сумма дробей: " + resultSumOne);
        System.out.println("Разность дробей: " + resultDifferenceOne);
        System.out.println("Произведение дробей: " + resultMultiplicationOne);
        System.out.println("Деление дробей: " + resultDivisionOne);
    }
}


