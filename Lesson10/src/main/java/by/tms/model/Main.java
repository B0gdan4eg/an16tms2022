package by.tms.model;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 160, "Black");
        Car bmw = new Car("BMW", 180, "White");
        Car volvo = new Car("Volvo", 110, "Blue");
        try {
            bmw.start();
        } catch (CarException e) {
            e.printStackTrace();
        }
        try {
            audi.start();
        } catch (CarException e) {
            e.printStackTrace();
        }
        try {
            volvo.start();
        } catch (CarException e) {
            e.printStackTrace();
        }
    }
}
