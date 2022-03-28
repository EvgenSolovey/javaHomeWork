package com.solovey.homeWorkNine.taskOne;

import java.util.Scanner;

public class Car extends Device {
    private String body; // кузов
    private int yearRelease; // год выпуска
    private double engineVolume; // объём двигателя
    private int enginePower; // мощность двигателя

    public Car(String deviceName, String manufacturer, String housingMaterial, String colour, String body,
               int yearRelease, double engineVolume, int enginePower) {
        super(deviceName, manufacturer, housingMaterial, colour);
        this.body = body;
        this.yearRelease = yearRelease;
        this.engineVolume = engineVolume;
        this.enginePower = enginePower;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void sound() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какой звук издает автомобиль: ");
        setSound(scanner.nextLine());
        System.out.println("Издаваемый звук: " + getSound());
    }

    public void show() {
        System.out.println("Название устройства: " + getDeviceName());
    }

    public void desc() {
        System.out.println("Производитель: " + getManufacturer());
        System.out.println("Материал корпуса: " + getHousingMaterial());
        System.out.println("Цвет: " + getColour());
        System.out.println("Кузов: " + getBody());
        System.out.println("Год выпуска: " + getYearRelease());
        System.out.println("Объём двигателя: " + getEngineVolume());
        System.out.println("Мощность двигателя: " + getEnginePower());
    }
}
