package by.tms.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public String getRecruitsWithName(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        Person[] people = personRegistry.getRecruits();
        for (Person person : people) {
            if (person.getName().equals(name)) {
                stringBuilder.append(person);
            }
        }
        return stringBuilder.toString();
    }

    public String getRecruitsWithCountry(String country) {
        StringBuilder stringBuilder = new StringBuilder();
        Person[] people = personRegistry.getRecruits();
        for (Person person : people) {
            if (person.getPersonAddress().getCountry().equals(country)) {
                stringBuilder.append(person);
            }
        }
        return stringBuilder.toString();
    }

    public String getRecruitsWithAge(int from, int to) {
        StringBuilder stringBuilder = new StringBuilder();
        Person[] people = personRegistry.getRecruits();
        for (Person person : people) {
            if (person.getAge() >= from && person.getAge() <= to) {
                stringBuilder.append(person);
            }
        }
        return stringBuilder.toString();
    }
}


