package by.tms.clothes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person {
    private String name;
    private Jeans jeans;
    private Jacket jacket;
    private Sneakers sneakers;

    public void putOn() {
        jeans.putOn();
        jacket.putOn();
        sneakers.putOn();
    }

    public void putOff() {
        jeans.putOff();
        jacket.putOff();
        sneakers.putOff();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", jeans=" + jeans +
                ", jacket=" + jacket +
                ", sneakers=" + sneakers +
                '}';
    }
}
