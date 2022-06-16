package by.tms.homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Task.summ(4, 5));
        System.out.println("-----------");
        char[][] chars = new char[4][];
        chars[0] = new char[]{'*', ' ', ' ', ' '};
        chars[1] = new char[]{'*', '*', ' ', ' '};
        chars[2] = new char[]{'*', '*', '*', ' '};
        chars[3] = new char[]{'*', '*', '*', '*'};
        for (char[] aChar : chars) {
            for (char c : aChar) {
                System.out.print(" " + c + " ");
            }
            System.out.println();
        }
        System.out.println("-----------");
        for (char[] aChar : chars) {
            for (int j = aChar.length - 1; j >= 0; j--) {
                System.out.print(" " + aChar[j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------");
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(" " + chars[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------");
        for (int i = 0; i < chars.length; i++) {
            for (int j = chars[i].length - 1; j >= 0; j--) {
                System.out.print(" " + chars[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------");
        int[] num = Task.oddNumbers(1, 100);
        for (int i = num.length - 1; i > 0; i--) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("-----------");
        Random random = new Random();
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(array));
        int index = Task.maxElIndex(array);
        int maxNum = array[index];
        System.out.println("Max number in array " + maxNum + ", First meeting Index = " + index);
        System.out.println("-----------");
        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(nums.length + 1);
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i += 2) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("-----------");
        System.out.println(Arrays.toString(array));
        int temp = array[0];
        array[0] = array[index];
        array[index] = temp;
        System.out.println(Arrays.toString(array));
        System.out.println("-----------");
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(10));
        }
        System.out.println(integers);
        System.out.println(Task.twoSets(integers));
        System.out.println("-----------");
        int[][] ints = new int[4][4];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = random.nextInt(51);
                System.out.printf("%4d", ints[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int[][] newInts = new int[ints.length][ints.length];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                newInts[j][i] = ints[i][j];
            }
        }
        for (int[] newInt : newInts) {
            for (int i : newInt) {
                System.out.printf("%4d", i);
            }
            System.out.println();
        }
        System.out.println("-----------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Width: ");
        int width = scanner.nextInt();
        System.out.print("Height :");
        int height = scanner.nextInt();
        int[][] intMatrix = new int[width][height];
        for (int i = 0; i < intMatrix.length; i++) {
            for (int j = 0; j < intMatrix[i].length; j++) {
                intMatrix[i][j] = random.nextInt(101);
                System.out.printf("%4d", intMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int[] matrix : intMatrix) {
            for (int i : matrix) {
                if (i % 3 == 0) {
                    System.out.printf("%4s", "+");
                } else if (i % 7 == 0) {
                    System.out.printf("%4s", "-");
                } else {
                    System.out.printf("%4s", "*");
                }
            }
            System.out.println();
        }
        System.out.println(Task.calculateSumOfDiagonalElements(intMatrix));
    }
}