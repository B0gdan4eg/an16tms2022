import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();
        if (Math.abs(num1) < Math.abs(num2) && Math.abs(num1) < Math.abs(num3)) {
            System.out.println(num1);
        }
        if (Math.abs(num2) < Math.abs(num1) && Math.abs(num2) < Math.abs(num3)) {
            System.out.println(num2);
        }
        if (Math.abs(num3) < Math.abs(num2) && Math.abs(num3) < Math.abs(num1)) {
            System.out.println(num3);
        }
    }
}

