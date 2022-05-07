import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int time = random.nextInt(28800);
        int countOfHours = time / 3600;
        System.out.println("for Petrov:" + time);
        System.out.println("for staff:" + countOfHours);
    }
}
