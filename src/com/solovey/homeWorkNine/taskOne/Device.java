package com.solovey.homeWorkNine.taskOne;

/*
Создать базовый класс «Устройство» и производные классы «Чайник», «Микроволновка», «Автомобиль», «Пароход».
С помощью конструктора установить имя каждого устройства и его характеристики. Реализуйте для каждого из классов методы:
- Sound — издает звук устройства (пишем текстом в консоль);
- Show — отображает название устройства;
- Desc — отображает описание устройства.
 */

public class Device {
    private String deviceName; // название устройства
    private String manufacturer; // производитель
    private String housingMaterial; // материал корпуса
    private String colour; // цвет
    private String sound; // издаваемый звук

    public Device(String deviceName, String manufacturer, String housingMaterial, String colour) {
        this.deviceName = deviceName;
        this.manufacturer = manufacturer;
        this.housingMaterial = housingMaterial;
        this.colour = colour;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getHousingMaterial() {
        return housingMaterial;
    }

    public void setHousingMaterial(String housingMaterial) {
        this.housingMaterial = housingMaterial;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}


