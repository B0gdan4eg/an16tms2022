package by.tms.main;

import by.tms.service.*;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        {
            people[0] = new Person("Bogdan", Sex.MALE, 19, new Address("Belarus", "bogies"));
        }
        {
            people[1] = new Person("Alex", Sex.MALE, 25, new Address("Belarus", "Brest"));
        }
        {
            people[2] = new Person("Vlad", Sex.MALE, 65, new Address("Belarus", "cron"));
        }
        {
            people[3] = new Person("Max", Sex.MALE, 15, new Address("Belarus", "cron"));
        }
        {
            people[4] = new Person("Ann", Sex.FEMALE, 18, new Address("Belarus", "bogies"));
        }

        MilitaryOffice militaryOffice = new MilitaryOffice(new PersonRegistry(people));
        System.out.println(militaryOffice.getRecruitsWithName("Alex"));
        System.out.println(militaryOffice.getRecruitsWithAge(24, 27));
        System.out.println(militaryOffice.getRecruitsWithCountry("Belarus"));
    }
}
