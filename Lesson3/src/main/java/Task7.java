import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] tNums = {1,2,3,4,5};
        System.out.println(max(tNums));
    }
    public static int max(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }
}
