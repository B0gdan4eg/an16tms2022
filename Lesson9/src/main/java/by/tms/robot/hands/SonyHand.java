package by.tms.robot.hands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class SonyHand implements IHand {
    private final static int cost = 80;


    @Override
    public int getCost() {
        return cost;
    }

    public String speak() {
        return "Sony";
    }
}
