package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Random;

@AllArgsConstructor
@Getter
@ToString
public class Car {
    private String model;
    private int speed;
    private String color;

    public void start() throws CarException {
        Random random = new Random();
        if (random.nextInt() % 2 == 0) {
            System.out.println("Car " + model + " start moving with " + speed + " km/h");
        } else {
            throw new CarException();
        }
    }
}
