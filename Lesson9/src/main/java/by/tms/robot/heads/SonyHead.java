package by.tms.robot.heads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class SonyHead implements IHead {
    private final static int cost = 50;

    @Override
    public String speak() {
        return "Samsung";
    }

    @Override
    public int getCost() {
        return cost;
    }
}
