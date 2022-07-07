package by.tms.task3;

import lombok.Getter;

@Getter
public class MinMax<T extends Number & Comparable<? super T>> {

    private final T[] arrayOfNumbers;

    public MinMax(T[] array) throws Exception {
        if (array != null) {
            this.arrayOfNumbers = array;
        } else {
            throw new Exception();
        }
    }

    public T[] sortArray() {
        int i = 0;
        do {
            i = 0;
            for (int j = 0; j < arrayOfNumbers.length - 1; j++) {
                if (arrayOfNumbers[j].compareTo(arrayOfNumbers[j + 1]) > 0) {
                    T temp = arrayOfNumbers[j];
                    arrayOfNumbers[j] = arrayOfNumbers[j + 1];
                    arrayOfNumbers[j + 1] = temp;
                    i++;
                }
            }
        } while (i != 0);
        return arrayOfNumbers;
    }

    public T getMax() {
        return arrayOfNumbers[arrayOfNumbers.length - 1];
    }

    public T getMin() {
        return arrayOfNumbers[0];
    }
}