import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int res = num;
        int numOfDigit = 0;
        String posOrNeg = "";
        if (num > 0) {
            posOrNeg = "Positive";
        } else {
            posOrNeg = "Negative";
        }
        do {
            num /= 10;
            numOfDigit++;
        } while (num != 0);
        System.out.println(res + " is " + posOrNeg + ", number of digits = " + numOfDigit);
    }
}
