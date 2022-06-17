package by.tms.robot.model;

import by.tms.robot.hands.SonyHand;
import by.tms.robot.heads.SamsungHead;
import by.tms.robot.legs.ToshibaLeg;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Robot implements IRobot {
    private SamsungHead samsungHead;
    private ToshibaLeg toshibaLeg;
    private SonyHand sonyHand;

    @Override
    public int getCost() {
        return samsungHead.getCost() + toshibaLeg.getCost() + sonyHand.getCost();
    }

    @Override
    public String action() {
        return "my constituents: " + samsungHead.speak() + " " + toshibaLeg.speak() + " " + sonyHand.speak();
    }
}
