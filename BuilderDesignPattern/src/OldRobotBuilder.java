public class OldRobotBuilder implements RobotBuilder{
    private Robot robot;

    public OldRobotBuilder(){
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Blowtorch arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Roller skates");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
