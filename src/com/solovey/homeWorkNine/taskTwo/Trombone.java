package com.solovey.homeWorkNine.taskTwo;

import java.util.Scanner;

public class Trombone extends MusicalInstrument {
    private String type; // вид тромбона
    private String deviceDesign; // строй инструмента

    public Trombone(String nameMusicalInstrument, String manufacturer, String soundSource, String type,
                    String deviceDesign) {
        super(nameMusicalInstrument, manufacturer, soundSource);
        this.type = type;
        this.deviceDesign = deviceDesign;
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
        System.out.println("Введите какой звук издает тромбон: ");
        setSound(scanner.nextLine());
        System.out.println("Издаваемый звук: " + getSound());
    }

    public void show() {
        System.out.println("Название музыкального инструмента: " + getNameMusicalInstrument());
    }

    public void desc() {
        System.out.println("Производитель: " + getManufacturer());
        System.out.println("Источник звука: " + getSoundSource());
        System.out.println("Вид тромбона: " + getType());
        System.out.println("Строй инструмента: " + getDeviceDesign());
    }

    public void history() {
        System.out.println("Появление тромбона относится к XV веку. Принято считать, что непосредственными п" + "\n" +
                "редшественниками этого инструмента были кулисные трубы, при игре на которых у музыканта была " + "\n" +
                "возможность передвигать трубку инструмента, таким образом получая хроматический звукоряд. " + "\n" +
                "Такие трубы использовались для удвоения голосов церковного хора, учитывая сходство тембра " + "\n" +
                "трубы с человеческим голосом. Нужно только было достичь сходства интонации, для чего и " + "\n" +
                "сделали кулису, дающую хроматизм и вибратор. За время своего существования тромбон " + "\n" +
                "практически не претерпел радикальных изменений в своей конструкции. Первые инструменты, по " + "\n" +
                "сути представлявшие собой тромбоны, назывались сакбутами (от фр. saquer — тянуть к себе, " + "\n" +
                "bouter — толкать от себя). Они были меньше современных инструментов по размеру и имели " + "\n" +
                "несколько разновидностей по регистрам певческих голосов, которые удваивали и тембру которых " + "\n" +
                "подражали: сопрано, альт, тенор и бас. Сакбуты благодаря хроматическому звукоряду сразу " + "\n" +
                "стали постоянными членами оркестров. Небольшие усовершенствования сакбутов привели к " + "\n" +
                "появлению в XVII веке практически современных инструментов, к которым в это время уже стало" + "\n" +
                "применяться итальянское слово trombone.");
    }
}
