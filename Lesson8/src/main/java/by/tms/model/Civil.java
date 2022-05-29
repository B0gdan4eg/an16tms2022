package by.tms.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Civil extends Air {
    private int numOfPassengers;
    private boolean business;

    public Civil(int power, int maxSpeed, int weight, String brand, int wingspanLength, int minLandingStrip, int numOfPassengers, boolean business) {
        super(power, maxSpeed, weight, brand, wingspanLength, minLandingStrip);
        this.numOfPassengers = numOfPassengers;
        this.business = business;
    }

    public String placePassengers(int num) {
        if (numOfPassengers >= num) {
            return "Самолет заполнен";
        } else {
            return "Вам нужен самолет побольше";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + numOfPassengers + " " + business + powerIntKV();
    }
}
