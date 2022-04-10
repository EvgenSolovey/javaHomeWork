package com.solovey.homeWorkNine.taskTwo;

import java.util.Scanner;

public class Violin extends MusicalInstrument {
    private int numberStrings; // количество струн
    private String size; // размер

    public Violin(String nameMusicalInstrument, String manufacturer, String soundSource, int numberStrings,
                  String size) {
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
        System.out.println("Введите какой звук издает скрипка: ");
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
        System.out.println("Первые упоминания о скрипке датируются началом 16 веком, в Италии. Хотя не " + "\n" +
                "сохранилось ни одного инструмента тех лет, ученые делают свои суждения по картинам и текстам " + "\n" +
                "того времени. Очевидно, что скрипка произошла от других смычковых инструментов. Историки " + "\n" +
                "связывают её появление с такими инструментами как греческая лира, испанская фидель, арабский " + "\n" +
                "ребаб, британская кротта и даже русской честырехструнной смычковой жигой. Позже, к середине " + "\n" +
                "16 века сложился окончательный образ скрипки, дошедший до наших дней. Страна происхождения " + "\n" +
                "скрипки – Италия. Именно здесь она получила свой изящный облик и нежный звук. Знаменитый " + "\n" +
                "скрипичный мастер, Гаспаро де Сало, поднял искусство изготовления скрипок на очень высокий " + "\n" +
                "уровень. Именно он придал скрипке тот внешний вид, что мы знаем сейчас. Изделия его " + "\n" +
                "мастерской высоко ценились среди знати и были очень востребованы при музыкальных дворах. " + "\n" +
                "Также, на протяжении всего 16 века изготовлением скрипок занималось целое семейство - Амати. " + "\n" +
                "Андреа Амати основал кремонскую школу скрипичных мастеров и усовершенствовал музыкальный " + "\n" +
                "инструмент скрипку, придав ей изящные формы. Гаспаро и Амати считают основоположниками " + "\n" +
                "скрипичного мастерства. Некоторые изделия этих знаменитых мастеров дожили до наших дней. " + "\n" +
                "На первых порах скрипка считалась простонародным инструментом – на ней играли бродячие " + "\n" +
                "музыканты в кабаках и придорожных трактирах. Скрипка была народной версией изысканной виолы, " + "\n" +
                "которая изготавливалась из лучших материалов и стоила огромных денег. В какой-то момент этим " + "\n" +
                "народным инструментом стала интересоваться знать, и она получила распространение среди" + "\n" +
                "культурных слоев населения. Так, в 1560 году французский король Чальз IX заказал 24 скрипки " + "\n" +
                "у местных мастеров. К слову, один из этих 24 инструментов сохранился до наших дней, и " + "\n" +
                "считается одним из самых старых на Земле. Самыми знаменитыми скрипичными мастерами, о " + "\n" +
                "которых помнят сегодня, являются Страдивари и Гварнери.");
    }
}