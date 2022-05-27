package by.tms.main;

import by.tms.model.Car;

public class MainCar {
    public static void main(String[] args) {
        Car ferrari = new Car("f11", new Car.GasTank(0, 60), 0);
        System.out.println(ferrari);
        ferrari.go();
        ferrari.start();
        ferrari.stop();
        ferrari.start();
        ferrari.getGasTank().refuel(60);
        System.out.println(ferrari);
        ferrari.start();
        ferrari.go();
        ferrari.go();
        System.out.println(ferrari);
    }
}
