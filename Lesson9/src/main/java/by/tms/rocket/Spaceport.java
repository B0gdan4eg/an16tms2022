package by.tms.rocket;

public class Spaceport {
    public boolean launch(IStart iStart) {
        if (iStart.allIsReady()) {
            return false;
        }
        iStart.engineStart();
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        iStart.start();
        return true;
    }
}
