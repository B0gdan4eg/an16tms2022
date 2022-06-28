package by.tms.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static by.tms.task1.StringHelper.getPalindromes;

public class Main {
    private static final String INPUT_FILE = "/Users/diana/Desktop/TMS/Homework/Lesson12/src/main/java/by/tms/task1/input";
    private static final String OUTPUT_FILE = "/Users/diana/Desktop/TMS/Homework/Lesson12/src/main/java/by/tms/task1/output";

    public static void main(String[] args) throws IOException {
        List<String> words = Files.readAllLines(Path.of(INPUT_FILE));
        Files.write(Path.of(OUTPUT_FILE), getPalindromes(words));
    }
}
