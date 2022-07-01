package by.tms.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Ground extends Transport {
    private int numOfWheels;
    private double fuelConsumption;

    public Ground(int power, int maxSpeed, int weight, String brand, int numOfWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.numOfWheels = numOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + " " + numOfWheels + " " + fuelConsumption;
    }
}
