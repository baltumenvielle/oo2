package ar.edu.unlp.info.oo2.rw.model;

public class SolarPanelCaterpillarRobotWithLasers extends SolarPanelCaterpillarRobot {
    public SolarPanelCaterpillarRobotWithLasers(String name) { super(name); }
    public void fireArms() { System.out.println("Robot " + this.getName() + " firing lasers"); }
}
