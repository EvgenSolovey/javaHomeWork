package com.solovey.homeWorkSeven.taskThree;

/*
Создайте класс «Страна». Необходимо хранить
в полях класса: название страны, название континента,
количество жителей в стране, телефонный код
страны, название столицы, название городов страны.
Реализуйте методы класса для ввода данных, вывода
данных, реализуйте доступ к отдельным полям через
методы класса.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Country {
    private String country;
    private String continent;
    private int numberResidents;
    private int phoneCode;
    private String capital;
    private String[] citiesOfTheCountry = new String[6];

    public Country() {
    }

    public Country(String country, String continent, int numberResidents, int phoneCode, String capital, String[] citiesOfTheCountry) {
        this.country = country;
        this.continent = continent;
        this.numberResidents = numberResidents;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.citiesOfTheCountry = citiesOfTheCountry;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getNumberResidents() {
        return numberResidents;
    }

    public void setNumberResidents(int numberResidents) {
        this.numberResidents = numberResidents;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String[] getCitiesOfTheCountry() {
        return citiesOfTheCountry;
    }

    public void setCitiesOfTheCountry(String[] citiesOfTheCountry) {
        this.citiesOfTheCountry = citiesOfTheCountry;
    }

    // метод для вывода данных
    public void dataOutput() {
        System.out.println("Страна: " + getCountry() + "; Континент: " + getContinent()
                + "; Население: " + getNumberResidents() + "; Телефонный код страны: " + getPhoneCode()
                + "; Столица: " + getCapital() + "; Города страны: " + Arrays.toString(getCitiesOfTheCountry()));
    }

    // метод для ввода данных
    public void dataInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные");
        System.out.println("Страна: ");
        setCountry(scanner.nextLine());
        System.out.println("Континент: ");
        setContinent(scanner.nextLine());
        System.out.println("Население: ");
        setNumberResidents(scanner.nextInt());
        System.out.println("Телефонный код страны: ");
        setPhoneCode(scanner.nextInt());
        System.out.println("Столица: ");
        setCapital(scanner.nextLine());
        System.out.println("Города страны: ");
        setCitiesOfTheCountry(new String[]{scanner.nextLine()});
    }
}
