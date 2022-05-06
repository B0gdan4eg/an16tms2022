import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        String str = in.nextLine();
        int[] numArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i : numArr) {
            if (i >= 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
//