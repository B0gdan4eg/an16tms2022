import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = in.nextInt();
        System.out.print("Введите месяц: ");
        int month = in.nextInt();
        switch (month) {
            case 1:
                if (checkDay(day, 1, 20)) {
                    System.out.println("Козерог");
                    break;
                } else if (checkDay(day, 21, 31)) {
                    System.out.println("Водолей");
                    break;
                }
            case 2:
                if (checkDay(day, 1, 19)) {
                    System.out.println("Водолей");
                    break;
                } else if (checkDay(day, 20, 28)) {
                    System.out.println("Рыбы");
                    break;
                }
            case 3:
                if (checkDay(day, 1, 20)) {
                    System.out.println("Рыбы");
                    break;
                } else if (checkDay(day, 21, 31)) {
                    System.out.println("Овен");
                    break;
                }
            case 4:
                if (checkDay(day, 1, 20)) {
                    System.out.println("Овен");
                    break;
                } else if (checkDay(day, 21, 30)) {
                    System.out.println("Телец");
                    break;
                }
            case 5:
                if (checkDay(day, 1, 21)) {
                    System.out.println("Телец");
                    break;
                } else if (checkDay(day, 22, 31)) {
                    System.out.println("Близнецы");
                    break;
                }
            case 6:
                if (checkDay(day, 1, 21)) {
                    System.out.println("Близнецы");
                    break;
                } else if (checkDay(day, 22, 30)) {
                    System.out.println("Рак");
                    break;
                }
            case 7:
                if (checkDay(day, 1, 22)) {
                    System.out.println("Рак");
                    break;
                } else if (checkDay(day, 23, 31)) {
                    System.out.println("Лев");
                    break;
                }
            case 8:
                if (checkDay(day, 1, 21)) {
                    System.out.println("Лев");
                    break;
                } else if (checkDay(day, 22, 31)) {
                    System.out.println("Дева");
                    break;
                }
            case 9:
                if (checkDay(day, 1, 23)) {
                    System.out.println("Дева");
                    break;
                } else if (checkDay(day, 24, 30)) {
                    System.out.println("Весы");
                    break;
                }
            case 10:
                if (checkDay(day, 1, 23)) {
                    System.out.println("Весы");
                    break;
                } else if (checkDay(day, 24, 31)) {
                    System.out.println("Скорпион");
                    break;
                }
            case 11:
                if (checkDay(day, 1, 23)) {
                    System.out.println("Скорпион");
                    break;
                } else if (checkDay(day, 24, 30)) {
                    System.out.println("Стрелец");
                    break;
                }
            case 12:
                if (checkDay(day, 1, 22)) {
                    System.out.println("Стрелец");
                    break;
                } else if (checkDay(day, 23, 31)) {
                    System.out.println("Козерог");
                    break;
                }
            default:
                System.out.println("Вы ввели не валидные данные");
        }
    }

    public static boolean checkDay(int day, int from, int to) {
        return day >= from && day <= to;
    }
}
