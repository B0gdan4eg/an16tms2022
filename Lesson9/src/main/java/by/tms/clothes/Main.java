package by.tms.clothes;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Person("Nick", new PBJeans(), new PumaJacket(), new NikeSneak());
        people[1] = new Person("Alex", new PBJeans(), new PumaJacket(), new PumaSneak());
        for (Person person : people) {
            System.out.println(person);
        }
        for (Person person : people) {
            person.putOn();
            System.out.println(person);
        }
        for (Person person : people) {
            person.putOff();
            System.out.println(person);
        }
    }
}

