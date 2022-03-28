package com.solovey.homeWorkNine.taskTwo;

import java.util.Scanner;

public class Cello extends MusicalInstrument {
    private int numberStrings; // количество струн
    private String size; // размер

    public Cello(String nameMusicalInstrument, String manufacturer, String soundSource, int numberStrings, String size) {
        super(nameMusicalInstrument, manufacturer, soundSource);
        this.numberStrings = numberStrings;
        this.size = size;
    }

    public int getNumberStrings() {
        return numberStrings;
    }

    public void setNumberStrings(int numberStrings) {
        this.numberStrings = numberStrings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void sound() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какой звук издает виолончель: ");
        setSound(scanner.nextLine());
        System.out.println("Издаваемый звук: " + getSound());
    }

    public void show() {
        System.out.println("Название музыкального инструмента: " + getNameMusicalInstrument());
    }

    public void desc() {
        System.out.println("Производитель: " + getManufacturer());
        System.out.println("Источник звука: " + getSoundSource());
        System.out.println("Количество струн: " + getNumberStrings());
        System.out.println("Размер: " + getSize());
    }

    public void history() {
        System.out.println("Официальная история виолончели начинается в XVI веке. Она вытеснила из оркестра " + "\n" +
                "предшественницу под названием виола да гамба, так как звучала гораздо благозвучнее. " + "\n" +
                "Существовало множество моделей, отличающихся размером, формой, музыкальными возможностями." + "\n" +
                "XVI – XVII века – период, когда итальянские мастера совершенствовали конструкцию, добиваясь " + "\n" +
                "раскрытия всех ее возможностей. Благодаря совместным усилиям, свет увидела модель со " + "\n" +
                "стандартным размером корпуса, единым количеством струн. Имена умельцев, приложивших руку к " + "\n" +
                "созданию инструмента, известны всему миру – А. Страдивари, Н. Амати, К. Бергонци. Интересный" + "\n" +
                "факт – самыми дорогими на сегодняшний день являются виолончели руки Страдивари. Классическая " + "\n" +
                "виолончель быстро набирала популярность. Для нее писали сольные произведения, затем пришла " + "\n" +
                "очередь занять почетное место в оркестре. ХХ век – очередная ступень к всеобщему признанию. " + "\n" +
                "Виолончель становится одним из ведущих инструментов, игре на ней обучают учеников " + "\n" +
                "музыкальных школ, без нее немыслимо исполнение классических произведений. Оркестр включает в " + "\n" +
                "состав минимум 8 виолончелистов. Репертуар инструмента весьма разнообразен: концертные " + "\n" +
                "программы, сольные партии, сонаты, аккомпанемент.");
    }
}
