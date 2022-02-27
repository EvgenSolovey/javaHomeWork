package com.solovey.homeWorkSeven.taskSix;

public class Main {
    public static void main(String[] args) {
        Car carOne = new Car("BMW e39", "BMW", 2000, 2.8);
        carOne.dataOutput();

        Car carTwo = new Car();
        carTwo.dataOutput("AUDI A6", "VAG");

        Car carThree = new Car();
        carThree.dataOutput("Mercedes-Benz W211", 2009);

        Car carFour = new Car();
        carFour.dataOutput("Lexus", 3.0);

        Car carFive = new Car();
        carFive.dataInput();
        carFive.dataOutput();
    }
}
