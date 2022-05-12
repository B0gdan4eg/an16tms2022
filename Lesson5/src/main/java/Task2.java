import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        char[][] charsArr = new char[4][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > 0; j--) {
                charsArr[i][j] = '*';
            }
        }
        System.out.println(Arrays.deepToString(charsArr));
    }
}
