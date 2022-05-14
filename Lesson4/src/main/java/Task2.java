import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amoeba = 1;
        int numOfDivision = in.nextInt() / 3;
        for (int i = 0; i < numOfDivision; i++) {
            amoeba *= 2;
        }
        System.out.println(amoeba);
    }
}
