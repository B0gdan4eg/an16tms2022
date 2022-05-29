package by.tms.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Air extends Transport {
    private int wingspanLength;
    private int minLandingStrip;

    public Air(int power, int maxSpeed, int weight, String brand, int wingspanLength, int minLandingStrip) {
        super(power, maxSpeed, weight, brand);
        this.wingspanLength = wingspanLength;
        this.minLandingStrip = minLandingStrip;
    }

    @Override
    public String toString() {
        return super.toString() + " " + wingspanLength + " " + minLandingStrip;
    }
}
