package com.solovey.homeWorkTen.taskOne;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();

        array.printIShow(new int[]{12, 313, 1323, 3123});
        array.printIShow("Полученный массив: ", new int[]{12, 313, 1323, 3123});

        int resultMax = array.maxIMath(new int[]{12, 313, 1323, 3123});
        int resultMin = array.minIMath(new int[]{12, 313, 1323, 3123});
        float resultAvg = array.avgIMath(new int[]{12, 313, 1323, 3123});
        System.out.println("Максимальное значение элемента массива: " + resultMax);
        System.out.println("Минимальное значение элемента массива: " + resultMin);
        System.out.println("Среднеарифметическое значение элементов массива: " + resultAvg);

        System.out.print("Отсортированный массив по возрастанию: ");
        array.sortAsc(new int[]{12, 313, 1323, 3123});
        System.out.println();
        System.out.print("Отсортированный массив по убыванию: ");
        array.sortDesc(new Integer[]{12, 313, 1323, 3123});
    }
}

