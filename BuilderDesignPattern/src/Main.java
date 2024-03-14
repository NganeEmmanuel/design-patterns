//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RobotBuilder robotBuilder = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);

        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Robot Built");
        System.out.println("Robot Head: "+firstRobot.getRobotHead());
        System.out.println("Robot Torso: "+firstRobot.getRobotTorso());
        System.out.println("Robot Arms: "+firstRobot.getRobotArms());
        System.out.println("Robot Legs: "+firstRobot.getRobotLegs());
    }
}