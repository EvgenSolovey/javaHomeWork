package com.solovey.homeWorkFive;

/*
Пользователь с клавиатуры вводит зарплату сотрудников фирмы.
Необходимо отсортировать полученные
данные по возрастанию или убыванию в зависимости
от выбора пользователя.
Выбор алгоритма сортировки
необходимо обосновать вашему преподавателю.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество сотрудников: ");
        int numberOfEmployees = scanner.nextInt();
        System.out.println("Введите зарплату сотрудников: ");
        double[] salaryOfEmployees = new double[numberOfEmployees];
        for (int i = 0; i < salaryOfEmployees.length; i++) {
            salaryOfEmployees[i] = scanner.nextDouble();
        }
        System.out.println("Список зарплат сотрудников: " + Arrays.toString(salaryOfEmployees));
        System.out.println("Выберите условие сортировки (нажмите 1 - по возрастанию; нажмите 2 - по убыванию): ");
        int condition = scanner.nextInt();
        switch (condition) {
            case 1:
                // Сортировка пузырьком
                // Внешний цикл каждый раз сокращает фрагмент массива, так как внутренний цикл каждый раз
                // ставит в конец фрагмента максимальный элемент
                for (int i = salaryOfEmployees.length - 1; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        // Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
                        if (salaryOfEmployees[j] > salaryOfEmployees[j + 1]) {
                            double reserveIncreasing = salaryOfEmployees[j];
                            salaryOfEmployees[j] = salaryOfEmployees[j + 1];
                            salaryOfEmployees[j + 1] = reserveIncreasing;

                        }
                    }
                }
                System.out.println("Список зарплат сотрудников по возрастанию: " + Arrays.toString(salaryOfEmployees));
                break;
            case 2:
                // Сортировка пузырьком
                for (int i = salaryOfEmployees.length - 1; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (salaryOfEmployees[j] < salaryOfEmployees[j + 1]) {
                            double reserveDecreasing = salaryOfEmployees[j];
                            salaryOfEmployees[j] = salaryOfEmployees[j + 1];
                            salaryOfEmployees[j + 1] = reserveDecreasing;
                        }
                    }
                }
                System.out.println("Список зарплат сотрудников по убыванию: " + Arrays.toString(salaryOfEmployees));
                break;
        }
    }
}

