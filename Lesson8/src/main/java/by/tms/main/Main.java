package by.tms.main;

import by.tms.model.Lightweight;

public class Main {
    public static void main(String[] args) {
        Lightweight car = new Lightweight(1, 2, 3, "d", 4, 0.5, "d", 4);
        System.out.println(car.maxSpeedRange(120));
    }
}
