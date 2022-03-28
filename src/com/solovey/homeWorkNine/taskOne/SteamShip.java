package com.solovey.homeWorkNine.taskOne;

import java.util.Scanner;

public class SteamShip extends Device {
    private int steamEnginePower; // мощность паровой машины
    private int vesselDisplacement; // водоизмещение судна
    private double vesselLength; // длина судна
    private int numberCrewMembers; // количество членов экипажа
    private int loadCapacity; // грузоподъемность судна

    public SteamShip(String deviceName, String manufacturer, String housingMaterial, String colour,
                     int steamEnginePower, int vesselDisplacement, double vesselLength, int numberCrewMembers, int loadCapacity) {
        super(deviceName, manufacturer, housingMaterial, colour);
        this.steamEnginePower = steamEnginePower;
        this.vesselDisplacement = vesselDisplacement;
        this.vesselLength = vesselLength;
        this.numberCrewMembers = numberCrewMembers;
        this.loadCapacity = loadCapacity;
    }

    public int getSteamEnginePower() {
        return steamEnginePower;
    }

    public void setSteamEnginePower(int steamEnginePower) {
        this.steamEnginePower = steamEnginePower;
    }

    public int getVesselDisplacement() {
        return vesselDisplacement;
    }

    public void setVesselDisplacement(int vesselDisplacement) {
        this.vesselDisplacement = vesselDisplacement;
    }

    public double getVesselLength() {
        return vesselLength;
    }

    public void setVesselLength(double vesselLength) {
        this.vesselLength = vesselLength;
    }

    public int getNumberCrewMembers() {
        return numberCrewMembers;
    }

    public void setNumberCrewMembers(int numberCrewMembers) {
        this.numberCrewMembers = numberCrewMembers;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void sound() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какой звук издает пароход: ");
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
        System.out.println("Мощность паровой машины: " + getSteamEnginePower());
        System.out.println("Водоизмещение судна: " + getVesselDisplacement());
        System.out.println("Длина судна: " + getVesselLength());
        System.out.println("Количество членов экипажа: " + getNumberCrewMembers());
        System.out.println("Грузоподъемность судна: " + getLoadCapacity());
    }
}
