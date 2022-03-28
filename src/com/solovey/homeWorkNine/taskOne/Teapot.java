package com.solovey.homeWorkNine.taskOne;

import java.util.Scanner;

public class Teapot extends Device {
    private int powerConsumption; // потребляемая мощность
    private double waterVolume; // объём воды
    private double cableLength; // длина кабеля

    public Teapot(String deviceName, String manufacturer, String housingMaterial, String colour,
                  int powerConsumption, double waterVolume, double cableLength) {
        super(deviceName, manufacturer, housingMaterial, colour);
        this.powerConsumption = powerConsumption;
        this.waterVolume = waterVolume;
        this.cableLength = cableLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWaterVolume() {
        return waterVolume;
    }

    public void setWaterVolume(double waterVolume) {
        this.waterVolume = waterVolume;
    }

    public double getCableLength() {
        return cableLength;
    }

    public void setCableLength(double cableLength) {
        this.cableLength = cableLength;
    }

    public void sound() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какой звук издает чайник: ");
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
        System.out.println("Потребляемая мощность: " + getPowerConsumption());
        System.out.println("Объём воды: " + getWaterVolume());
        System.out.println("Длина кабеля: " + getCableLength());
    }
}
