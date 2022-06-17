package by.tms.robot.model;

import by.tms.robot.hands.ToshibaHand;
import by.tms.robot.heads.ToshibaHead;
import by.tms.robot.legs.ToshibaLeg;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class RobotCheapest implements IRobot {
    private ToshibaLeg toshibaLeg;
    private ToshibaHand toshibaHand;
    private ToshibaHead toshibaHead;

    @Override
    public int getCost() {
        return toshibaHand.getCost() + toshibaLeg.getCost() + toshibaHead.getCost();
    }

    @Override
    public String action() {
        return "my constituents: " + toshibaHead.speak() + " " + toshibaLeg.speak() + " " + toshibaHand.speak();
    }
}

