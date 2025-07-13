package ar.edu.unlp.info.oo2.rw.model;

public class SolarPanelOvercraftRobotWithLasers extends SolarPanelOvercraftRobot {
    public SolarPanelOvercraftRobotWithLasers(String name) { super(name); }
    public void fireArms() { System.out.println("Robot " + this.getName() + " firing lasers"); }
}
