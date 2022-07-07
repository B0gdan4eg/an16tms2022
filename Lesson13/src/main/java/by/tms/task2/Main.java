package by.tms.task2;

public class Main {
    public static void main(String[] args) {
        Generic<String, Animals, Double> genericTest = new Generic<>("String", new Animals("Bob", 11), 1.2);
        genericTest.getClassesName();
        System.out.println(genericTest.getT());
        System.out.println(genericTest.getV());
        System.out.println(genericTest.getK());
    }
}
