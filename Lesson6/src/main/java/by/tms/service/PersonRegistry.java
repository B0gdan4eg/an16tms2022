package by.tms.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Setter
@Getter
@AllArgsConstructor
public class PersonRegistry {
    private Person[] people;

    public Person[] getRecruits() {
        int count = 0;
        Person[] recruits = new Person[people.length];
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getSex().equals(Sex.MALE)) {
                recruits[i] = person;
                count++;
            }
        }
        return Arrays.copyOfRange(recruits, 0, count); //Убираю пустые ячейки
    }
}
