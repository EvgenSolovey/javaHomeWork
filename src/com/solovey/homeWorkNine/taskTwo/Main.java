package com.solovey.homeWorkNine.taskTwo;

public class Main {
    public static void main(String[] args) {
        Violin violin = new Violin("Скрипка", "Angelo", "Струнный",
                4, "1/2");
        violin.sound();
        violin.show();
        violin.desc();
        violin.history();

        Trombone trombone = new Trombone("Тромбон", "Yamaha", "Духовой",
                "Тенор", "in C");
        trombone.sound();
        trombone.show();
        trombone.desc();
        trombone.history();

        Ukulele ukulele = new Ukulele("Укулеле", "BATON ROUGE", "Струнный",
                4, "Сопрано", "Gм");
        ukulele.sound();
        ukulele.show();
        ukulele.desc();
        ukulele.history();

        Cello cello = new Cello("Виолончель", "Brahner", "Струнный",
                4, "3/4");
        cello.sound();
        cello.show();
        cello.desc();
        cello.history();
    }
}
