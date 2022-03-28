package com.solovey.homeWorkNine.taskOne;

import java.util.Scanner;

public class MicrowaveOven extends Device {
    private int microwavePower; // мощность микроволн
    private int workingChamberVolume; // объем рабочей камеры
    private int diameterPallet; // диаметр вращающегося поддона

    public MicrowaveOven(String deviceName, String manufacturer, String housingMaterial, String colour,
                         int microwavePower, int workingChamberVolume, int diameterPallet) {
        super(deviceName, manufacturer, housingMaterial, colour);
        this.microwavePower = microwavePower;
        this.workingChamberVolume = workingChamberVolume;
        this.diameterPallet = diameterPallet;
    }

    public int getMicrowavePower() {
        return microwavePower;
    }

    public void setMicrowavePower(int microwavePower) {
        this.microwavePower = microwavePower;
    }

    public int getWorkingChamberVolume() {
        return workingChamberVolume;
    }

    public void setWorkingChamberVolume(int workingChamberVolume) {
        this.workingChamberVolume = workingChamberVolume;
    }

    public int getDiameterPallet() {
        return diameterPallet;
    }

    public void setDiameterPallet(int diameterPallet) {
        this.diameterPallet = diameterPallet;
    }

    public void sound() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какой звук издает микроволновка: ");
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
        System.out.println("Мощность микроволн: " + getMicrowavePower());
        System.out.println("Объем рабочей камеры: " + getWorkingChamberVolume());
        System.out.println("Диаметр вращающегося поддона: " + getDiameterPallet());
    }
}
