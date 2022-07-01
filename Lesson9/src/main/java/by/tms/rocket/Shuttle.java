package by.tms.rocket;

import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean allIsReady() {
        Random random = new Random();
        return random.nextInt(10) > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Shuttle engines launched. All systems are ok");
    }

    @Override
    public void start() {
        System.out.println("Shuttle Start");
    }
}
