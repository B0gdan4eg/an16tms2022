package by.tms.task5;

import java.io.File;
import java.io.IOException;


public class Main {
    private static final String FILE_NAME = "/Users/diana/Desktop/TMS/Homework/Lesson12/src/main/java/by/tms/task5/car";

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_NAME);
        Car carFromJson = ObjJsonInteract.readObjFormJson(file, Car.class);
        System.out.println(carFromJson);
    }
}
