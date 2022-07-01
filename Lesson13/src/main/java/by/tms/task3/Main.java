package by.tms.task3;

public class Main {
    public static void main(String[] args) {
        Double[] numbersDouble = {1.2, 2.2, 89.2, 19032.23, 23.22323};
        Integer[] numbersInteger = {123, 32, 23145432, 231};
        try {
            MinMax<?> minMaxDouble = new MinMax<>(numbersDouble);
            MinMax<Integer> minMaxInteger = new MinMax<>(numbersInteger);
            printMinAndMaxValue(minMaxDouble);
            getInfo(minMaxDouble);
            printMinAndMaxValue(minMaxInteger);
            getInfo(minMaxInteger);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printMinAndMaxValue(MinMax<?> minMax) {
        minMax.sortArray();
        System.out.println("Min element: " + minMax.getMin() + "\n" + "Max element " + minMax.getMax());
    }

    private static void getInfo(MinMax<?> minMax) {
        for (int i = 0; i < minMax.getArrayOfNumbers().length; i++) {
            System.out.println("Element " + minMax.getArrayOfNumbers()[i] + " type " + minMax.getArrayOfNumbers()[i].getClass().getName());
        }
        System.out.println();
    }
}