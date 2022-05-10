import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            int num  = in.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
        catch(Exception ex){
            System.out.println("Not an Integer");
        }
    }
}
