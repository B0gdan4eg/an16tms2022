package by.tms.task3;

import by.tms.task1.StringHelper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    private static final String BLACKLIST = "/Users/diana/Desktop/TMS/Homework/Lesson12/src/main/java/by/tms/task3/blacklist";
    private static final String BLACKLIST_SEPARATOR = "[,\\s]+";
    private static final String TEXT = "/Users/diana/Desktop/TMS/Homework/Lesson12/src/main/java/by/tms/task3/text";

    public static void main(String[] args) throws IOException {

        String text = Files.readString(Path.of(TEXT));
        String[] blacklist = Files.readString(Path.of(BLACKLIST)).split(BLACKLIST_SEPARATOR);

        if (!StringHelper.hasBlacklistWordInString(text, blacklist)) {
            System.out.println("В тексте не встечаются слова из чёрного списка.");
            return;
        } else {
            System.out.println("В тексте обнаружены слова из чёрного списка." +
                    "\nПредложения, подлежащие исправлению:");
        }
        List<String> sentences = StringHelper.getSentencesFromText(text);
        int sentencesWithBLWords = 0;
        for (String sentence : sentences) {
            if (StringHelper.hasBlacklistWordInString(sentence, blacklist)) {
                System.out.println(sentence);
                sentencesWithBLWords++;
            }
        }
        System.out.println("Всего предложений, подлежащих исправлению: " + sentencesWithBLWords);
    }
}
