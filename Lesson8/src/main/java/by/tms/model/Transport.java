package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String brand;

    @Override
    public String toString() {
        return "Transport{ " +
                "power= " + power +
                ", maxSpeed= " + maxSpeed +
                ", weight= " + weight +
                ", brand= '" + brand + '\'' +
                " }";
    }

    public double powerIntKV() {
        return getPower() * 0.74;
    }
}
