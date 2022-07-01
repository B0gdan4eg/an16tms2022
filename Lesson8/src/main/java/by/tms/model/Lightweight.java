package by.tms.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lightweight extends Ground {
    private String bodyType;
    private int numOfPassengers;

    public Lightweight(int power, int maxSpeed, int weight, String brand, int numOfWheels, double fuelConsumption, String bodyType, int numOfPassengers) {
        super(power, maxSpeed, weight, brand, numOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numOfPassengers = numOfPassengers;
    }

    @Override
    public String toString() {
        return super.toString() + " " + bodyType + " " + numOfPassengers + " " + powerIntKV();
    }

    public String maxSpeedRange(double time) {
        return " За " + time / 60 + " ч, автомобиль " + getBrand()
                + "двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч "
                + "проедет " + getMaxSpeed() * time / 60 + " км и израсходует " + getMaxSpeed() * time / 60 * getFuelConsumption() + " литров топлива.";
    }
}
