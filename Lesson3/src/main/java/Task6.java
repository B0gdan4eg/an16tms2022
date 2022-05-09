public class Task6 {
    public static void main(String[] args) {
        int[] tNums = {1,2,3,4,5};
        System.out.println(average(tNums));
    }
    public static double average(int[] array) {
        int sum = 0;
        for (int i : array){
            sum += i;
        }
        return (double) sum / array.length;
    }
}
