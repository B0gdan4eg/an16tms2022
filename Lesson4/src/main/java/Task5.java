import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        countDevs(103);
        countDevs(11);
        foobar(6);
        foobar(10);
        foobar(15);
        printPrimeNumbers();
    }

    private static void printArray() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isCorrect;
        int num = 0;
        do {
            isCorrect = true;
            System.out.print("Введите целое натурально число num: ");
            try {
                num = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Вы ввели неверные данные, повторите ввод");
                isCorrect = false;
            }
            if (isCorrect && num < 1) {
                System.out.println("Вы ввели отрицательное число!");
                isCorrect = false;
            }
        } while (!isCorrect);
        int[] nums = new int[num];
        for (int i = 0; i < nums.length; i++) {
            int rand = random.nextInt(100);
            nums[i] = rand;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static int operation(int number) {
        int num = number;
        if (number == 0) {
            num = 10;
        }
        if (number >= 0) {
            num++;
        }
        if (number < 0) {
            num -= 2;
        }
        return num;
    }

    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int result = 0;
        for (int i : ints) {
            if (i % 2 != 0) {
                result++;
            }
        }
        return result;
    }

    public static void countDevs(int count) {
        int rem = count % 100;
        if (rem < 11 || rem > 14) {
            rem = count % 10;
            if (rem == 1) {
                System.out.println("Программист");
            }
            if (rem >= 2 && rem <= 4) {
                System.out.println("Программиста");
            }
        } else {
            System.out.println("Программистов");
        }
    }

    public static void foobar(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                System.out.println("foobar");
            } else {
                System.out.println("foo");
            }
        } else {
            System.out.println("bar");
        }
    }

    public static void printPrimeNumbers() {
        int i, j;
        boolean isPrime;
        for (i = 2; i < 1000; i++) {
            isPrime = true;
            for (j = 2; j <= i / j; j++) {
                if ((i % j) == 0) {
                    isPrime = false;
                }
                if (isPrime) {
                    System.out.println(i + " - простое число.");
                }
            }
        }
    }
}
