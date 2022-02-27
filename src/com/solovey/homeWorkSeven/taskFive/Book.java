package com.solovey.homeWorkSeven.taskFive;

/*
Реализуйте класс «Книга». Необходимо хранить в полях класса:
название книги, ФИО автора, год выпуска,
название издательства, жанр книги, количество страниц.
Реализуйте конструкторы и методы класса для ввода
данных, вывода данных, реализуйте доступ к отдельным
полям через методы класса. Используйте механизм перегрузки методов.
 */

import java.util.Scanner;

public class Book {
    private String title;
    private String surnameWriter;
    private String firstnameWriter;
    private String patronymicWriter;
    private int year;
    private String publishingHouse;
    private String genre;
    private int quantityPages;

    public Book() {
    }

    public Book(String title, String surnameWriter, String firstnameWriter, String patronymicWriter,
                int year, String publishingHouse, String genre, int quantityPages) {
        this.title = title;
        this.surnameWriter = surnameWriter;
        this.firstnameWriter = firstnameWriter;
        this.patronymicWriter = patronymicWriter;
        this.year = year;
        this.publishingHouse = publishingHouse;
        this.genre = genre;
        this.quantityPages = quantityPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSurnameWriter() {
        return surnameWriter;
    }

    public void setSurnameWriter(String surnameWriter) {
        this.surnameWriter = surnameWriter;
    }

    public String getFirstnameWriter() {
        return firstnameWriter;
    }

    public void setFirstnameWriter(String firstnameWriter) {
        this.firstnameWriter = firstnameWriter;
    }

    public String getPatronymicWriter() {
        return patronymicWriter;
    }

    public void setPatronymicWriter(String patronymicWriter) {
        this.patronymicWriter = patronymicWriter;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getQuantityPages() {
        return quantityPages;
    }

    public void setQuantityPages(int quantityPages) {
        this.quantityPages = quantityPages;
    }

    public void dataOutput() {
        System.out.println("Название книги: " + getTitle() + "; Фамилия: " + getSurnameWriter()
                + "; Имя: " + getFirstnameWriter() + "; Отчество: " + getPatronymicWriter()
                + "; Год выпуска: " + getYear() + "; Название издательства: " + getPublishingHouse()
                + "; Жанр книги: " + getGenre() + "; Количество страниц: " + getQuantityPages());
    }

    public void dataOutput(String title, String surnameWriter, String firstnameWriter, int year, String genre) {
        System.out.println("Название книги: " + title + "; Фамилия: " + surnameWriter
                + "; Имя: " + firstnameWriter + "; Год выпуска: " + year + "; Жанр книги: " + genre);
    }

    public void dataOutput(String title, String surnameWriter) {
        System.out.println("Название книги: " + title + "; Фамилия: " + surnameWriter);
    }

    public void dataInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные");
        System.out.println("Название книги: ");
        setTitle(scanner.nextLine());
        System.out.println("Фамилия: ");
        setSurnameWriter(scanner.nextLine());
        System.out.println("Имя: ");
        setFirstnameWriter(scanner.nextLine());
        System.out.println("Отчество: ");
        setPatronymicWriter(scanner.nextLine());
        System.out.println("Год выпуска: ");
        setYear(scanner.nextInt());
        System.out.println("Название издательства: ");
        setPublishingHouse(scanner.nextLine());
        System.out.println("Жанр книги: ");
        setGenre(scanner.nextLine());
        System.out.println("Количество страниц: ");
        setQuantityPages(scanner.nextInt());
    }
}
