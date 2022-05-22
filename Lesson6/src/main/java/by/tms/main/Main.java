package by.tms.main;

public class Main {
    public static void main(String[] args) {
        Person[] personRegistry = new Person[5];
        personRegistry[0] = new Person("Bogdan", "Male", 19, new Address("Belarus", "bogies"));
        personRegistry[1] = new Person("Alex", "Male", 25, new Address("Belarus", "Brest"));
        personRegistry[2] = new Person("Vlad", "Male", 65, new Address("Belarus", "cron"));
        personRegistry[3] = new Person("Max", "Male", 15, new Address("Belarus", "cron"));
        personRegistry[4] = new Person("Ann", "Female", 18, new Address("Belarus", "bogies"));

        MilitaryOffice.checkPersonFit(personRegistry);
        MilitaryOffice.whoIsFit(personRegistry);
        MilitaryOffice.sortedFitByName(personRegistry, "Bogdan");
        MilitaryOffice.sortedFitByAge(personRegistry, 24, 27);
        MilitaryOffice.sortedFitByCity(personRegistry, "cron");
    }
}

