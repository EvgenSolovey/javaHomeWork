package com.solovey.homeWorkSeven.taskOne;

public class Main {
    public static void main(String[] args) {
        Human humanOne = new Human("Иванов", "Иван", "Иванович", "01.01.1990",
                "+375330101000", "Гродно", "Беларусь", "ул.Партизанская, д.10, кв.1");
        humanOne.dataOutput();

        Human humanTwo = new Human();
        humanTwo.setSurname("Петров");
        humanTwo.setFirstname("Пётр");
        humanTwo.setPatronymic("Петрович");
        humanTwo.setDateOfBirth("02.02.1992");
        humanTwo.setPhoneNumber("+375290202000");
        humanTwo.setCity("Гомель");
        humanTwo.setCountry("Беларусь");
        humanTwo.setAddress("ул.Советская, д.20, кв.2");
        humanTwo.dataOutput();

        Human humanThree = new Human();
        humanThree.dataInput();
        humanThree.dataOutput();
    }
}
