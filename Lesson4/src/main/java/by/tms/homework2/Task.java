package by.tms.homework2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task {
    public static int summ(int a, int b) {
        if (checkEven(a)) {
            return b << a / 2;
        } else if (checkEven(b)) {
            return a << b / 2;
        }
        return a * b;
    }

    public static boolean checkEven(int a) {
        return a % 2 == 0;
    }

    public static int[] oddNumbers(int from, int to) {
        int[] num = new int[to / 2];
        int i = from;
        for (int j = 0; j < num.length; j++) {
            num[j] = i;
            i += 2;
        }
        return num;
    }

    public static int maxElIndex(int[] nums) {
        int max = nums[0];
        int indexForMax = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (max < num) {
                max = num;
                indexForMax = i;
            }
        }
        return indexForMax;
    }

    public static Set<Integer> twoSets(List<Integer> data) {
        Set<Integer> foundNums = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : data) {
            if (foundNums.contains(num)) {
                duplicates.add(num);
            } else {
                foundNums.add(num);
            }
        }
        return duplicates;
    }

    public static int calculateSumOfDiagonalElements(int[][] matrix) {
        int sum = 0;
        for (int i = 0, j = 0; i < matrix.length; ++i) {
            if (j < matrix[0].length)
                sum += matrix[i][j++];
        }
        return sum;
    }
}