package com.solovey.homeWorkFive;

/*
Есть два двумерных массива (матрицы размером
2x2), заполненные случайными числами. Найдите сумму
матриц, разницу матриц, произведение матриц.
 */

import java.util.Arrays;
import java.util.Random;

public class TaskEight {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arrayOne = new int[2][2]; // матрица А
        int[][] arrayTwo = new int[2][2]; // матрица В
        int[][] sumArrays = new int[2][2]; // матрица С
        int[][] differenceArrays = new int[2][2];
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne.length; j++) {
                arrayOne[i][j] = random.nextInt();
            }
        }
        System.out.println("Элементы первого двумерного массива: " + Arrays.deepToString(arrayOne));
        // Метод deepToString() - Возвращает строковое представление указанного массива.
        // Если массив содержит другие массивы как элементы, строковое представление содержит их содержимое и так далее.
        // Этот метод предназначен для преобразования многомерных массивов в строки.
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                arrayTwo[i][j] = random.nextInt();
            }
        }
        System.out.println("Элементы второго двумерного массива: " + Arrays.deepToString(arrayTwo));

        // Находим сумму матриц
        // Сумма матриц A и B — это матрица C, в которой все элементы есть суммы соответствующих элементов матриц A и B.
        // При этом сами матрицы должны иметь одинаковое строение — или быть прямоугольными, либо квадратными.

        for (int i = 0; i < sumArrays.length; i++) {
            for (int j = 0; j < sumArrays.length; j++) {
                sumArrays[i][j] = arrayOne[i][j] + arrayTwo[i][j];
            }
        }
        System.out.println("Сумма матриц: " + Arrays.deepToString(sumArrays));

        // Находим разность матриц
        // Разность двух матриц — это матрица С, элементы которой получены путем вычитания из соответствующих элементов
        // первой матрицы А соответствующих элементов второй матрицы В.
        // Матрицы должны быть одинакового размера (одинаковое строение).
        for (int i = 0; i < differenceArrays.length; i++) {
            for (int j = 0; j < differenceArrays.length; j++) {
                differenceArrays[i][j] = arrayOne[i][j] - arrayTwo[i][j];
            }
        }
        System.out.println("Разность матриц: " + Arrays.deepToString(differenceArrays));

        // Находим произведение матриц
        // Матрицы A и B могут быть перемножены, если они совместимы в том смысле что число столбцов матрицы A равно
        // числу строк B. Матрицы, для которых данное условие не выполняется, умножать нельзя.

        // Правило умножения матриц
        // Чтобы умножить матрицу на матрицу необходимо умножать последовательно каждый элемент каждой строки первой
        // матрицы на каждый элемент каждого столбца второй матрицы и сумму этих произведений записать в соответствующем
        // элементе матрицы-произведения.

        int stringOne = arrayOne.length;
        int columnOne = arrayOne[0].length;
        int columnTwo = arrayOne[0].length;
        int[][] multiplicationArrays = new int[stringOne][columnTwo];
        for (int i = 0; i < stringOne; i++) {
            for (int j = 0; j < columnTwo; j++) {
                for (int k = 0; k < columnOne; k++) {
                    multiplicationArrays[i][j] += arrayOne[i][k] * arrayTwo[k][j];
                    // первый элемент со строки первого массива умножаем на первый элемент со столбца второго массива плюс
                    // второй элемент со строки первого массива умножаем на второй элемент со столбца второго массива плюс
                    // третий элемент со строки первого массива умножаем на третий элемент со столбца второго массива плюс
                    // и т.д.
                }
            }
        }
        System.out.println("Произведение матриц: " + Arrays.deepToString(multiplicationArrays));
    }
}



