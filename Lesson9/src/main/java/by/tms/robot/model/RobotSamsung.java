package by.tms.robot.model;

import by.tms.robot.hands.SamsungHand;
import by.tms.robot.heads.SamsungHead;
import by.tms.robot.legs.SamsungLeg;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class RobotSamsung implements IRobot {
    private SamsungHead samsungHead;
    private SamsungHand samsungHand;
    private SamsungLeg samsungLeg;

    @Override
    public int getCost() {
        return samsungHead.getCost() + samsungLeg.getCost() + samsungHand.getCost();
    }

    @Override
    public String action() {
        return "my constituents: " + samsungHead.speak() + " " + samsungHand.speak() + " " + samsungLeg.speak();
    }
}
