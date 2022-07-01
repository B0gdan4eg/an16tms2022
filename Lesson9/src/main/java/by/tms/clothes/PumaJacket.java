package by.tms.clothes;

import lombok.ToString;

@ToString
public class PumaJacket implements Jacket {
    public boolean onPerson;

    @Override
    public void putOn() {
        onPerson = true;
    }

    @Override
    public void putOff() {
        onPerson = false;
    }
}
