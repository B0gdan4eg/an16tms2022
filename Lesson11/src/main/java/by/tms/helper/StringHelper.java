package by.tms.helper;

import java.util.Arrays;
import java.util.regex.Pattern;

public final class StringHelper {

    public static String FromFirsAtoLastB(String str) {
        return str.substring(str.indexOf('A'), str.lastIndexOf('B') + 1);
    }

    public static String Pos3ToPos0(String str) {
        if (str.length() < 4) {
            return "Строка слишком кароткая";
        }
        char[] chars = str.toCharArray();
        chars[3] = chars[0];
        return String.valueOf(chars);
    }

    public static String[] palindromeCheck(String str) {
        String[] result = new String[countOfWords(str)];
        StringBuilder stringBuilder;
        int i = 0;
        for (String string : str.split(" ")) {
            stringBuilder = new StringBuilder("");
            stringBuilder.append(string).reverse();
            if (string.equals(stringBuilder.toString())) {
                result[i] = string;
                i++;
            }
        }
        return Arrays.copyOf(result, i);
    }

    public static void countOfSentences(String str, int from, int to) {
        int lastCheckingStop = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                if (palindromeCheck(str.substring(lastCheckingStop, i)).length > 0 || countOfWords(str.substring(lastCheckingStop, i)) >= from && countOfWords(str.substring(lastCheckingStop, i)) <= to) {
                    System.out.println(str.substring(lastCheckingStop, i));

                }
                lastCheckingStop = i + 1;
            }
        }
    }

    public static int countOfWords(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static String middleOfWord(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public static boolean validate(String str) {
        return Pattern.compile("[a-z[1-5]&&[^_]]{4,20}").matcher(str).matches();
    }
}