public class Task1 {
    public static void main(String[] args) {
        printLiterals();
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(calculateHypotenuse(3, 4));
    }

    private static void printLiterals() {
        System.out.println(true);
        System.out.println("Test");
        System.out.println('t');
        System.out.println(0b0001);
        System.out.println(010);
        System.out.println(10);
        System.out.println(0x06F);
        System.out.println(2f);
        System.out.println(2d);
    }

    public static int sum(int a, int b) {
        if (Integer.MAX_VALUE - a < b){
            return -1;
        }  else {
            return a + b;
        }
    }
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
    public static double calculateHypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }
}

