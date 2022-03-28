package com.solovey.homeWorkNine.taskTwo;

import java.util.Scanner;

public class Ukulele extends MusicalInstrument {
    private int numberStrings; // количество струн
    private String type; // вид укулеле
    private String deviceDesign; // строй инструмента

    public Ukulele(String nameMusicalInstrument, String manufacturer, String soundSource, int numberStrings,
                   String type, String deviceDesign) {
        super(nameMusicalInstrument, manufacturer, soundSource);
        this.numberStrings = numberStrings;
        this.type = type;
        this.deviceDesign = deviceDesign;
    }

    public int getNumberStrings() {
        return numberStrings;
    }

    public void setNumberStrings(int numberStrings) {
        this.numberStrings = numberStrings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeviceDesign() {
        return deviceDesign;
    }

    public void setDeviceDesign(String deviceDesign) {
        this.deviceDesign = deviceDesign;
    }

    public void sound() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какой звук издает укулеле: ");
        setSound(scanner.nextLine());
        System.out.println("Издаваемый звук: " + getSound());
    }

    public void show() {
        System.out.println("Название музыкального инструмента: " + getNameMusicalInstrument());
    }

    public void desc() {
        System.out.println("Производитель: " + getManufacturer());
        System.out.println("Источник звука: " + getSoundSource());
        System.out.println("Вид укулеле: " + getType());
        System.out.println("Строй инструмента: " + getDeviceDesign());
    }

    public void history() {
        System.out.println("Укулеле появилась на Гавайских островах во второй половине XIX века, куда её, под " + "\n" +
                "названием машети да браса (порт. machete da braça), завезли португальцы с острова Мадейра. " + "\n" +
                "Первый магазин по продаже укулеле на Гавайях был открыт в 1880 году Мануэлем Нуньесом " + "\n" +
                "(1843—1922). Гавайцы используют укулеле для исполнения сентиментальных песен на английском " + "\n" +
                "языке и музыки в «гавайском стиле». Название инструмента (гав. ʻukulele) переводится как " + "\n" +
                "«скачущая блоха» — то, на что похожи быстрые движения правой руки при игре на укулеле. " + "\n" +
                "Учитывая, что прежде чем попасть на Гавайи, родственная укулеле маленькая гитара кавакинью в " + "\n" +
                "XV веке была завезена португальцами в Африку, возможно что это название как-то связано со " + "\n" +
                "словом укулеле из южно-африканского (кафрского) языка коса (уку — инфинитивная частица," + "\n" +
                "подобная англ. to + леле — глагол спать), смысл которого хорошо передаёт мечтательное и " + "\n" +
                "задумчивое настроение, вызываемое звуками укулеле. В США инструмент начал обретать " + "\n" +
                "популярность после выступлений гавайских музыкантов в рамках Панамо-Тихоокеанской выставки, " + "\n" +
                "проходившей в Сан-Франциско в 1915 году[3]. Пик популярности пришёлся на 1930-е. " + "\n" +
                "В связи с историей укулеле в России следует отметить тот факт, что в 1994 году " + "\n" +
                "педагогу-новатору Э. Я. Смеловой (1934—2021[8]) был выдан патент на полезную модель " + "\n" +
                "музыкального инструмента Гитарайка (от слов гитара и балалайка), схожего с укулеле концерт " + "\n" +
                "по форме, длине струн (37,2—37,8 см) и строю (Gм С1 E1 G1). Эдельвена Смелова использовала " + "\n" +
                "гитарайку и свирель в собственной методике музыкального обучения детей как минимум с 1988 " + "\n" +
                "года, задолго до активного роста популярности укулеле в России в первой половине 2010-х.");
    }
}
