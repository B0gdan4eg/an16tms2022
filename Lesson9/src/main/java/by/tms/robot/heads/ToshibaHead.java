package by.tms.robot.heads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class ToshibaHead implements IHead {
    private final static int cost = 20;

    @Override
    public String speak() {
        return "Samsung";
    }

    @Override
    public int getCost() {
        return cost;
    }
}
