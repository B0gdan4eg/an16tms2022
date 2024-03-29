package by.tms.task4;

import java.io.*;

public class Main {

    private static String FILE = "/Users/diana/Desktop/TMS/Homework/Lesson12/src/main/java/by/tms/task4/car.ser";

    public static void main(String[] args) {
        Car car = new Car("Honda", 250, 40000);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE))) {
            outputStream.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Car carFromFile = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE))) {
            carFromFile = (Car) inputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(carFromFile);
    }
}
