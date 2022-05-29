package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Car {
    private final Engine engine = new Engine("ДВС", 0.3);
    private String model;
    private GasTank gasTank;
    private int range;

    public Car(String model, GasTank gasTank, int range) {
        this.model = model;
        this.gasTank = gasTank;
        this.range = range;
    }


    public void go() {
        if (start()) {
            System.out.println("The car passed: " + movement());
        } else {
            System.out.println("Machine not running");
        }
    }

    private int movement() {
        System.out.println("The car went");
        int range = 0;
        int speed = 1;
        do {
            speed *= 2;
            System.out.println(speed + " km/h");
        } while (speed != 256);
        range += gasTank.fuelNow / engine.fuelConsumption;
        gasTank.setFuelNow(0);
        setRange(getRange() + range);
        return range;
    }

    public boolean start() {
        if (engine.startEngine()) {
            System.out.println("Car is start");
            return true;
        } else {
            System.out.println("Not enough fuel");
            return false;
        }
    }

    public void stop() {
        System.out.println("Engine off");
    }


    ////////////////
    ////////////////


    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public GasTank getGasTank() {
        return gasTank;
    }

    private void setGasTank(GasTank gasTank) {
        this.gasTank = gasTank;
    }

    @Setter
    @Getter
    @AllArgsConstructor
    @ToString
    public class Engine {
        private String type;
        private double fuelConsumption;

        public boolean startEngine() {
            return gasTank.getFuelNow() > 0;
        }
    }


    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    public static class GasTank {
        private int fuelNow;
        private int capacity;

        public void refuel(int fuel) {
            fuelNow += fuel;
        }
    }
}
