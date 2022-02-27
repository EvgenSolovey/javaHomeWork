package com.solovey.homeWorkSeven.taskSix;

/*
Реализуйте класс «Автомобиль». Необходимо хранить в полях класса: название автомобиля, название
производителя, год выпуска, объём двигателя. Реализуйте конструкторы и методы класса для ввода данных,
вывода данных, реализуйте доступ к отдельным полям
через методы класса. Используйте механизм перегрузки
методов.
 */

import java.util.Scanner;

public class Car {
    private String title;
    private String manufacturer;
    private int year;
    private double volumeEngine;

    public Car() {
    }

    public Car(String title, String manufacturer, int year, double volumeEngine) {
        this.title = title;
        this.manufacturer = manufacturer;
        this.year = year;
        this.volumeEngine = volumeEngine;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(double volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public void dataOutput() {
        System.out.println("Название автомобиля: " + getTitle() + "; Название производителя: " + getManufacturer()
                + "; Год выпуска: " + getYear() + "; Объём двигателя: " + getVolumeEngine());
    }

    public void dataOutput(String title, String manufacturer) {
        System.out.println("Название автомобиля: " + title + "; Название производителя: " + manufacturer);
    }

    public void dataOutput(String title, int year) {
        System.out.println("Название автомобиля: " + title + " ; Год выпуска: " + year);
    }

    public void dataOutput(String title, double volumeEngine) {
        System.out.println("Название автомобиля: " + title + " ; Объём двигателя: " + volumeEngine);
    }

    public void dataInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные");
        System.out.println("Название автомобиля: ");
        setTitle(scanner.nextLine());
        System.out.println("Название производителя: ");
        setManufacturer(scanner.nextLine());
        System.out.println("Год выпуска: ");
        setYear(scanner.nextInt());
        System.out.println("Объём двигателя: ");
        setVolumeEngine(scanner.nextDouble());
    }
}
