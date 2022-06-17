package by.tms.robot.hands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class SamsungHand implements IHand {
    private final static int cost = 100;

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String speak() {
        return "Samsung";
    }
}
