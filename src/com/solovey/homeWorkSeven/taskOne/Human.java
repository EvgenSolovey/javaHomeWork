package com.solovey.homeWorkSeven.taskOne;

/*
Реализуйте класс «Человек». Необходимо хранить
в полях класса: ФИО, дату рождения, контактный телефон,
город, страну, домашний адрес. Реализуйте методы
класса для ввода данных, вывода данных, реализуйте
доступ к отдельным полям через методы класса
 */

import java.util.Scanner;

public class Human {
    // поля класса
    private String surname;
    private String firstname;
    private String patronymic;
    private String dateOfBirth;
    private String phoneNumber;
    private String city;
    private String country;
    private String address;

    // пустой конструктор
    public Human() {
    }

    /*
    Конструктор — это специальный метод, который имеет имя, совпадающее с именем класса, и вызывается при создании
    экземпляра объекта совместно с оператором new. Результатом работы этого метода всегда является экземпляр класса.
    Цель конструктора — правильно инициализировать объект перед его использованием.
    */

    // конструктор
    public Human(String surname, String firstname, String patronymic, String dateOfBirth, String phoneNumber,
                 String city, String country, String address) {
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    /*
    get (гетер) - получать, т.е. метод для получения значения поля
    set (сетер) - устанавливать, т.е. метод для установки значения поля
     */

    // гетеры и сетеры
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // метод для вывода данных
    void dataOutput() {
        System.out.println("Фамилия: " + getSurname() + "; Имя: " + getFirstname() + "; Отчество: " + getPatronymic()
                + "; Дата рождения: " + getDateOfBirth() + "; Номер телефона: " + getPhoneNumber()
                + "; Город: " + getCity() + "; Страна: " + getCountry() + "; Адрес: " + getAddress());
    }

    // метод для ввода данных
    public void dataInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные");
        System.out.println("Фамилия: ");
        setSurname(scanner.nextLine());
        System.out.println("Имя: ");
        setFirstname(scanner.nextLine());
        System.out.println("Отчество: ");
        setPatronymic(scanner.nextLine());
        System.out.println("Дата рождения: ");
        setDateOfBirth(scanner.nextLine());
        System.out.println("Номер телефона: ");
        setPhoneNumber(scanner.nextLine());
        System.out.println("Город: ");
        setCity(scanner.nextLine());
        System.out.println("Страна: ");
        setCountry(scanner.nextLine());
        System.out.println("Адрес: ");
        setAddress(scanner.nextLine());
    }
}
