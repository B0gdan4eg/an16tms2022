public class Task3 {
    public static void main(String[] args) {
        int[] oddNums = new int[49];
        int j = 0;
        for (int i = 1; i < 100; i += 2, j++) {
            oddNums[j] = i;
        }
    }
}
}
