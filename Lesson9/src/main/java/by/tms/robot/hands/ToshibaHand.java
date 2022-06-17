package by.tms.robot.hands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ToshibaHand implements IHand {
    private final static int cost = 50;

    @Override
    public int getCost() {
        return cost;
    }

    public String speak() {
        return "Toshiba";
    }
}
