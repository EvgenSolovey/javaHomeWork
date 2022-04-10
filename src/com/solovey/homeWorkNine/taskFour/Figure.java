package com.solovey.homeWorkNine.taskFour;

/*
Создайте абстрактный базовый класс Фигура с абстрактным методом для подсчета площади. Создайте производные классы:
прямоугольник, круг, прямоугольный треугольник, трапеция со своими реализациями метода для подсчета площади.
Для проверки определите массив ссылок на абстрактный класс, которым присваиваются адреса различных объектов
классов-потомков.
 */

public abstract class Figure {

    public abstract String nameFigure();

    public abstract double calculatingArea();
}