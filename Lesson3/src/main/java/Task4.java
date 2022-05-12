import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int time = random.nextInt(28801);
        int countOfHours = time / 3600;
        if (countOfHours != 0) {
            if (countOfHours > 1) {
                System.out.println("for staff: " + countOfHours + " hours");
            } else {
                System.out.println("for staff: " + countOfHours + " hour");
            }
        } else {
            System.out.println("for staff: less then hour");
        }
        System.out.println("for Petrov: " + time);
    }
}
