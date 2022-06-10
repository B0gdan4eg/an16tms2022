package by.tms.regex;

import by.tms.helper.StringHelper;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HMRegex {
    public static void main(String[] args) {
        String text2 = "One two three раз два три one1 two2 123_ ";
        String text = "cab, ccab, cccab";
        String versions = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        Pattern pattern1 = Pattern.compile("Java \\d+"); // если "Java *\\d+" если с пробелами
        Pattern pattern = Pattern.compile("c*ab");
        Matcher matcher = pattern.matcher(text);
        Matcher matcher1 = pattern1.matcher(versions);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
        while (matcher1.find()) {
            System.out.println(versions.substring(matcher1.start(), matcher1.end()));
        }
        System.out.println(Arrays.toString(text2.split("[^a-zA-Z]+")));
        System.out.println(StringHelper.validate("ssss_"));
        System.out.println(StringHelper.validate("ssss1214214"));
        System.out.println(StringHelper.validate("ssss8"));
    }
}
