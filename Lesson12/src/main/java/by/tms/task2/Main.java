package by.tms.task2;

import by.tms.task1.StringHelper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String INPUT_FILE = "/Users/diana/Desktop/TMS/Homework/Lesson12/src/main/java/by/tms/task2/input";
    private static final String OUTPUT_FILE = "/Users/diana/Desktop/TMS/Homework/Lesson12/src/main/java/by/tms/task2/output";

    public static void main(String[] args) throws IOException {
        String text = Files.readString(Path.of(INPUT_FILE));

        List<String> sentences = StringHelper.getSentencesFromText(text);
        List<String> filteredSentences = new ArrayList<>();
        for (String sentence : sentences) {
            int numberOfWords = StringHelper.getCountWordsInString(sentence);
            if (numberOfWords >= 3 && numberOfWords <= 5 || StringHelper.hasPalindromeInString(sentence)) {
                filteredSentences.add(sentence);
            }
        }

        Files.write(Path.of(OUTPUT_FILE), filteredSentences);
    }
}