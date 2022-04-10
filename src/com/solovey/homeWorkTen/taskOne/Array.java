package com.solovey.homeWorkTen.taskOne;

/*
Создайте интерфейс IShow. В нём должно быть два метода void Print() и void Print(String info).
Создайте класс Array (массив целого типа) с необходимыми методами. Этот класс должен имплементировать интерфейс IShow.
Метод Print() — отображает на экран элементы массива.
Метод Print(String info) — отображает на экран элементы массива и информационное сообщение, указанное в параметре info.
Напишите код для тестирования полученной функциональности.

Создайте интерфейс IMath. В нём должно быть три метода: int Max(), int Min(), float Avg().
Класс, созданный в первом задании Array, должен имплементировать интерфейс IMath.
Метод Max — возвращает максимум среди элементов массива.
Метод Min — возвращает минимум среди элементов массива.
Метод Avg — возвращает среднеарифметическое среди элементов массива.
Напишите код для тестирования полученной функциональности.

Создайте интерфейс ISort. В нём должно быть два метода:
- void SortAsc() — сортировка по возрастанию;
- void SortDesc() — сортировка по убыванию.
Класс, созданный в первом задании Array, должен имплементировать интерфейс ISort.
Метод SortAsc — сортирует массив по возрастанию.
Метод SortDesc — сортирует массив по убыванию.
Напишите код для тестирования полученной функциональности.
 */

import java.util.Arrays;
import java.util.Collections;

public class Array implements IShow, IMath, ISort {

    private int[] array;

    public Array() {

    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public void printIShow(int[] array) { // Метод отображает на экран элементы массива
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    @Override
    public void printIShow(String info, int[] array) { // Метод отображает на экран элементы массива и информационное сообщение
        System.out.print(info);
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    @Override
    public int maxIMath(int[] array) { // Метод возвращает максимум среди элементов массива
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    @Override
    public int minIMath(int[] array) { // Метод возвращает минимум среди элементов массива
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    @Override
    public float avgIMath(int[] array) { // Метод возвращает среднеарифметическое среди элементов массива
        double average = 0;
        for (int j : array) {
            average += j;
        }
        return (float) (average / array.length);
    }

    @Override
    public void sortAsc(int[] array) { // Метод сортирует массив по возрастанию
        Arrays.sort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    @Override
    public void sortDesc(Integer[] array) { // Метод сортирует массив по убыванию
        Arrays.sort(array, Collections.reverseOrder()); // работает с обертками - в данном случае с Integer
        for (int j : array) {                           // не может работать с примитивами - int или long
            System.out.print(j + " ");
        }
    }
}



