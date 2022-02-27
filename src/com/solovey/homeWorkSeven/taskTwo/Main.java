package com.solovey.homeWorkSeven.taskTwo;

public class Main {
    public static void main(String[] args) {
        City cityOne = new City("Гродно","Гродненская область","Беларусь",365610,
                230000,152);
        cityOne.dataOutput();

        City cityTwo = new City();
        cityTwo.setCity("Гомель");
        cityTwo.setRegion("Гомельская область");
        cityTwo.setCountry("Беларусь");
        cityTwo.setNumberResidents(493988);
        cityTwo.setPostalCode(240000);
        cityTwo.setTelephoneCode(232);
        cityTwo.dataOutput();

        City cityThree = new City();
        cityThree.dataInput();
        cityThree.dataOutput();
    }
}
