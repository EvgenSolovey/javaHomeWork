package com.solovey.homeWorkSeven.taskFive;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Евгений Онегин", "Пушкин", "Александр",
                "Сергеевич", 2000, "Российский издательский дом", "Роман",
                224);
        bookOne.dataOutput();

        Book bookTwo = new Book();
        bookTwo.dataOutput("Герой нашего времени", "Лермонтов", "Михаил", 1990,
                "Проза");

        Book bookThree = new Book();
        bookThree.dataOutput("Анна Каренина", "Толстой");

        Book bookFour = new Book();
        bookFour.dataInput();
        bookFour.dataOutput();
    }
}
