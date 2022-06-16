package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Employee implements GenerateReport {
    private double salary;
    private String fullName;

    @Override
    public void report() {
        String[] str = fullName.split(" ");
        System.out.printf("Employee: |%s.%s. %-20s  |  %20.2f|\n", str[0].charAt(0), str[1].charAt(0), str[2], salary);
    }
}
