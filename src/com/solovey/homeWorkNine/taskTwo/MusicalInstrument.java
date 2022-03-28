package com.solovey.homeWorkNine.taskTwo;

/*
Создать базовый класс «Музыкальный инструмент» и производные классы «Скрипка», «Тромбон», «Укулеле», «Виолончель».
С помощью конструктора установить имя каждого музыкального инструмента и его характеристики.
Реализуйте для каждого из классов методы:
- Sound — издает звук музыкального инструмента (пишем текстом в консоль);
- Show — отображает название музыкального инструмента;
- Desc — отображает описание музыкального инструмента;
- History — отображает историю создания музыкального инструмента.
 */

public class MusicalInstrument {
    private String nameMusicalInstrument; // название музыкального инструмента
    private String manufacturer; // производитель
    private String soundSource; // источник звука
    private String sound; // звук музыкального инструмента

    public MusicalInstrument(String nameMusicalInstrument, String manufacturer, String soundSource) {
        this.nameMusicalInstrument = nameMusicalInstrument;
        this.manufacturer = manufacturer;
        this.soundSource = soundSource;
    }

    public String getNameMusicalInstrument() {
        return nameMusicalInstrument;
    }

    public void setNameMusicalInstrument(String nameMusicalInstrument) {
        this.nameMusicalInstrument = nameMusicalInstrument;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSoundSource() {
        return soundSource;
    }

    public void setSoundSource(String soundSource) {
        this.soundSource = soundSource;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
