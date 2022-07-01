package by.tms.clothes;

import lombok.ToString;

@ToString
public class NikeSneak implements Sneakers {
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
