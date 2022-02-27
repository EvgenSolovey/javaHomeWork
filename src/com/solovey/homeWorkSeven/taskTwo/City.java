package com.solovey.homeWorkSeven.taskTwo;

/*
Создайте класс «Город». Необходимо хранить в полях класса: название города, название региона, название
страны, количество жителей в городе, почтовый индекс
города, телефонный код города. Реализуйте методы класса для ввода данных, вывода данных, реализуйте доступ
к отдельным полям через методы класса
 */

import java.util.Scanner;

public class City {
    // поля класса
    private String city;
    private String region;
    private String country;
    private int numberResidents;
    private int postalCode;
    private int telephoneCode;

    // пустой конструктор
    public City() {
    }

    // конструктор
    public City(String city, String region, String country, int numberResidents, int postalCode, int telephoneCode) {
        this.city = city;
        this.region = region;
        this.country = country;
        this.numberResidents = numberResidents;
        this.postalCode = postalCode;
        this.telephoneCode = telephoneCode;
    }

    // гетеры и сетеры
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumberResidents() {
        return numberResidents;
    }

    public void setNumberResidents(int numberResidents) {
        this.numberResidents = numberResidents;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public int getTelephoneCode() {
        return telephoneCode;
    }

    public void setTelephoneCode(int telephoneCode) {
        this.telephoneCode = telephoneCode;
    }

    // метод для вывода данных
    public void dataOutput() {
        System.out.println("Город: " + getCity() + "; Региона: " + getRegion() + "; Страна: " + getCountry()
                + "; Население: " + getNumberResidents() + "; Почтовый индекс: " + getPostalCode()
                + "; Телефонный код: " + getTelephoneCode());
    }

    // метод для ввода данных
    public void dataInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные");
        System.out.println("Название города: ");
        setCity(scanner.nextLine());
        System.out.println("Название региона: ");
        setRegion(scanner.nextLine());
        System.out.println("Название страны: ");
        setCountry(scanner.nextLine());
        System.out.println("Количество жителей в городе: ");
        setNumberResidents(scanner.nextInt());
        System.out.println("Почтовый индекс города: ");
        setPostalCode(scanner.nextInt());
        System.out.println("Телефонный код города: ");
        setTelephoneCode(scanner.nextInt());
    }
}
