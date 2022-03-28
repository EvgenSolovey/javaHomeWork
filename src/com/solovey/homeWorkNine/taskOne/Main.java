package com.solovey.homeWorkNine.taskOne;

public class Main {
    public static void main(String[] args) {
        Teapot teapot = new Teapot("Чайник", "Bosch", "Пластик", "Белый",
                2200, 1.5, 1);
        teapot.sound();
        teapot.show();
        teapot.desc();

        MicrowaveOven microwaveOven = new MicrowaveOven("Микроволновка", "Samsung",
                "Нержавеющая сталь", "Металлик", 700, 20,
                255);
        microwaveOven.sound();
        microwaveOven.show();
        microwaveOven.desc();

        Car car = new Car("Автомобиль", "BMW", "Сталь", "Синий", "Седан",
                2003, 2.5, 192);
        car.sound();
        car.show();
        car.desc();

        SteamShip steamShip = new SteamShip("Пароход", "Балтийский завод",
                "Сталь", "Серый", 11971, 6731, 126.7,
                570, 400);
        steamShip.sound();
        steamShip.show();
        steamShip.desc();
    }
}
