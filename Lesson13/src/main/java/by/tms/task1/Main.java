package by.tms.task1;

import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        readFiles(new File("/Users/diana/Desktop/TMS/Homework/Lesson13"));
    }

    public static void readFiles(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (Objects.nonNull(files)) {
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName() + " : " + "File");
                    } else {
                        System.out.println(file.getName() + " : " + "Catalog");
                        readFiles(file);
                    }
                }
            }
        }
    }
}
