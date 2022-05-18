import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean checkOutput = false;
        System.out.print("Введите день: ");
        int day = in.nextInt();
        System.out.print("Введите месяц: ");
        int month = in.nextInt();
        switch (month) {
            case 1:
                if (checkDay(day, 1, 20)) {
                    System.out.println("Козерог");
                    checkOutput = true;
                } else if (checkDay(day, 21, 31)) {
                    System.out.println("Водолей");
                    checkOutput = true;
                }
                break;
            case 2:
                if (checkDay(day, 1, 19)) {
                    System.out.println("Водолей");
                    checkOutput = true;
                } else if (checkDay(day, 20, 28)) {
                    System.out.println("Рыбы");
                    checkOutput = true;
                }
                break;
            case 3:
                if (checkDay(day, 1, 20)) {
                    System.out.println("Рыбы");
                    checkOutput = true;
                    break;
                } else if (checkDay(day, 21, 31)) {
                    System.out.println("Овен");
                    checkOutput = true;
                }
                break;
            case 4:
                if (checkDay(day, 1, 20)) {
                    System.out.println("Овен");
                    checkOutput = true;
                } else if (checkDay(day, 21, 30)) {
                    System.out.println("Телец");
                    checkOutput = true;
                }
                break;
            case 5:
                if (checkDay(day, 1, 21)) {
                    System.out.println("Телец");
                    checkOutput = true;
                } else if (checkDay(day, 22, 31)) {
                    System.out.println("Близнецы");
                    checkOutput = true;
                }
                break;
            case 6:
                if (checkDay(day, 1, 21)) {
                    System.out.println("Близнецы");
                    checkOutput = true;
                } else if (checkDay(day, 22, 30)) {
                    System.out.println("Рак");
                    checkOutput = true;
                }
                break;
            case 7:
                if (checkDay(day, 1, 22)) {
                    System.out.println("Рак");
                    checkOutput = true;
                } else if (checkDay(day, 23, 31)) {
                    System.out.println("Лев");
                    checkOutput = true;
                }
                break;
            case 8:
                if (checkDay(day, 1, 21)) {
                    System.out.println("Лев");
                    checkOutput = true;
                } else if (checkDay(day, 22, 31)) {
                    System.out.println("Дева");
                    checkOutput = true;
                }
                break;
            case 9:
                if (checkDay(day, 1, 23)) {
                    System.out.println("Дева");
                    checkOutput = true;
                } else if (checkDay(day, 24, 30)) {
                    System.out.println("Весы");
                    checkOutput = true;
                }
                break;
            case 10:
                if (checkDay(day, 1, 23)) {
                    System.out.println("Весы");
                    checkOutput = true;
                } else if (checkDay(day, 24, 31)) {
                    System.out.println("Скорпион");
                    checkOutput = true;
                }
                break;
            case 11:
                if (checkDay(day, 1, 23)) {
                    System.out.println("Скорпион");
                    checkOutput = true;
                } else if (checkDay(day, 24, 30)) {
                    System.out.println("Стрелец");
                    checkOutput = true;
                }
                break;
            case 12:
                if (checkDay(day, 1, 22)) {
                    System.out.println("Стрелец");
                    checkOutput = true;
                } else if (checkDay(day, 23, 31)) {
                    System.out.println("Козерог");
                    checkOutput = true;
                }
                break;
        }
        if (!checkOutput) {
            System.out.println("Вы ввели не валидные данные");
        }
    }

    public static boolean checkDay(int day, int from, int to) {
        return day >= from && day <= to;
    }
}
