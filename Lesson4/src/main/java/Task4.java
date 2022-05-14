import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = in.nextInt();
        System.out.print("Введите месяц: ");
        int month = in.nextInt();
        float res = 0;
        if (day / 10 == 0) {
            res = (float) day / 100;
        } else {
            res = day;
        }
        float date = month + res;
        String sign = "";
        if (date >= 1.20) {
            sign = "Водолей";
        }
        if (date >= 2.19) {
            sign = "Рыбы";
        }
        if (date >= 3.21) {
            sign = "Овен";
        }
        if (date >= 4.21) {
            sign = "Телец";
        }
        if (date >= 5.21) {
            sign = "Близницы";
        }
        if (date >= 6.21) {
            sign = "Рак";
        }
        if (date >= 7.23) {
            sign = "Лев";
        }
        if (date >= 8.23) {
            sign = "Дева";
        }
        if (date >= 9.23) {
            sign = "Весы";
        }
        if (date >= 10.23) {
            sign = "Скорпион";
        }
        if (date >= 11.22) {
            sign = "Стрелец";
        }
        if (date >= 12.22) {
            sign = "Козерог";
        }
        System.out.println(sign);
    }
}
