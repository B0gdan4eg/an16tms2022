package by.tms.clothes;

public class PumaJacket implements Jacket {
    public boolean onPerson;

    @Override
    public boolean putOn() {
        onPerson = true;
        return false;
    }

    @Override
    public boolean putOff() {
        return false;
    }
}
