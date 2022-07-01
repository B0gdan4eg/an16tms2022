package by.tms.main;


import by.tms.robot.hands.SamsungHand;
import by.tms.robot.hands.SonyHand;
import by.tms.robot.hands.ToshibaHand;
import by.tms.robot.heads.SamsungHead;
import by.tms.robot.heads.ToshibaHead;
import by.tms.robot.legs.SamsungLeg;
import by.tms.robot.legs.ToshibaLeg;
import by.tms.robot.model.Robot;
import by.tms.robot.model.RobotCheapest;
import by.tms.robot.model.RobotSamsung;


public class Main {
    public static void main(String[] args) {
        Robot mike = new Robot(new SamsungHead(), new ToshibaLeg(), new SonyHand());
        RobotSamsung bob = new RobotSamsung(new SamsungHead(), new SamsungHand(), new SamsungLeg());
        RobotCheapest tom = new RobotCheapest(new ToshibaLeg(), new ToshibaHand(), new ToshibaHead());
        System.out.println(mike.getCost());
        System.out.println(mike.action());
        System.out.println(bob.getCost());
        System.out.println(bob.action());
        System.out.println(tom.getCost());
        System.out.println(tom.action());
        System.out.println("-------");
        if (mike.getCost() > tom.getCost() && mike.getCost() > bob.getCost()) {
            System.out.println(mike + " is the most expensive");
        } else if (bob.getCost() > tom.getCost() && bob.getCost() > mike.getCost()) {
            System.out.println(bob + " is the most expensive");
        } else if (tom.getCost() > mike.getCost() && tom.getCost() > bob.getCost()) {
            System.out.println(tom + " is the most expensive");
        }
    }
}