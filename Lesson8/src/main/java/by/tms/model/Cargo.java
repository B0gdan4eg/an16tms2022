package by.tms.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cargo extends Ground {
    private int loadCapacity;

    public Cargo(int power, int maxSpeed, int weight, String brand, int numOfWheels, double fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, brand, numOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public String placeThisLoad(int load) {
        if (loadCapacity >= load) {
            return "Грузовик загружен";
        } else {
            return "Вам нужен грузовик побольше";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + loadCapacity + getPower() * 0.74;
    }
}
