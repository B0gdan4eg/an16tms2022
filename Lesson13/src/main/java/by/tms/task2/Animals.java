package by.tms.task2;

import java.io.Serializable;

public class Animals implements AnimalsAware, Serializable {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void say() {
        System.out.println("Say!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
