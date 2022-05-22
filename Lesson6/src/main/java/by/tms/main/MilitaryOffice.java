package by.tms.main;

public class MilitaryOffice {
    private Person[] personRegistry;

    public static void checkPersonFit(Person[] personRegistry) {
        for (Person person : personRegistry) {
            person.setFit(person.getAge() >= 18 && person.getAge() < 27 && person.getSex().equals("Male"));
        }
    }
    //Метод проверяет на возраст и пол, присваивает статус Person годен/не годен

    public static void whoIsFit(Person[] personRegistry) {
        for (Person person : personRegistry) {
            if (person.isFit()) {
                System.out.println(person.getName());
            }
        }
    }
    //метод вывод имена всех Person кто годен

    public static void sortedFitByName(Person[] personRegistry, String name) {
        for (Person person : personRegistry) {
            if (person.isFit() && person.getName().equals(name)) {
                System.out.println(person.getName());
            }
        }
    }
    // метод выводит годных с одинаковыми именами, имя передается в метод

    public static void sortedFitByCity(Person[] personRegistry, String city) {
        for (Person person : personRegistry) {
            if (person.isFit() && person.getPersonAddress().getCity().equals(city)) {
                System.out.println(person.getName());
            }
        }
    }
    //метод выводит имена годных с указаного вами города

    public static void sortedFitByAge(Person[] personRegistry, int from, int to) {
        for (Person person : personRegistry) {
            if (person.isFit() && (person.getAge() > from && person.getAge() < to)) {
                System.out.println(person.getName());
            }
        }
    }
    // метод выводит имена годных соответсвующих промежутку от и до переданого в метод
}


