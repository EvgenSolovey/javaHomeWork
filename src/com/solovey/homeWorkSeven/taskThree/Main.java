package com.solovey.homeWorkSeven.taskThree;

public class Main {
    public static void main(String[] args) {
        Country countryOne = new Country("Беларусь", "Восточная Европа", 9349645,
                375, "Минск", new String[]{"Минск", "Гомель", "Витебск", "Могилёв", "Гродно", "Брест"});
        countryOne.dataOutput();

        Country countryTwo = new Country();
        countryTwo.setCountry("Россия");
        countryTwo.setContinent("Восточная Европа и Северная Азия");
        countryTwo.setNumberResidents(145478097);
        countryTwo.setPhoneCode(7);
        countryTwo.setCapital("Москва");
        countryTwo.setCitiesOfTheCountry(new String[]{"Москва", "Санкт-Петербург", "Новосибирск", "Екатеринбург",
                "Нижний Новгород", "Ростов-на-Дону", "Казань", "Челябинск", "Самара", "Омск"});
        countryTwo.dataOutput();

        Country countryThree = new Country();
        countryThree.dataInput();
        countryThree.dataOutput();
    }
}
