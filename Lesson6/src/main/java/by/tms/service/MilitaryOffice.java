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
}


