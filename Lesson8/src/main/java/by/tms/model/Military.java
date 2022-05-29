package by.tms.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Military extends Air {
    private boolean ejectionSystem;
    private int numOfMissiles;

    public Military(int power, int maxSpeed, int weight, String brand, int wingspanLength, int minLandingStrip, boolean ejectionSystem, int numOfMissiles) {
        super(power, maxSpeed, weight, brand, wingspanLength, minLandingStrip);
        this.ejectionSystem = ejectionSystem;
        this.numOfMissiles = numOfMissiles;
    }

    public String fire() {
        if (numOfMissiles > 0) {
            return "Ракета пошла";
        } else {
            return "Боеприпасы закончились";
        }
    }

    public String ejection() {
        if (ejectionSystem) {
            return "Катапультирование прошло успешно";
        } else {
            return "У вас нет такой системы";
        }
    }


    @Override
    public String toString() {
        return super.toString() + " " + ejectionSystem + " " + numOfMissiles + getPower() * 0.74;
    }
}
