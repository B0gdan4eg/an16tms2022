package by.tms.homework1;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(6) + 1;
        String day = "";
        switch (num) {
            case 1 -> day = "Monday";
            case 2 -> day = "Tuesday";
            case 3 -> day = "Wednesday";
            case 4 -> day = "Thursday";
            case 5 -> day = "Friday";
            case 6, 7 -> day = "day off";
        }
        System.out.println(day);
    }
}
