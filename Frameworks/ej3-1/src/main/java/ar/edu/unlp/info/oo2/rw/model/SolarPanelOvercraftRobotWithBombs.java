package ar.edu.unlp.info.oo2.rw.model;

public class SolarPanelOvercraftRobotWithBombs extends SolarPanelOvercraftRobot {
    public SolarPanelOvercraftRobotWithBombs(String name) { super(name); }
    public void fireArms() { System.out.println("Robot " + this.getName() + " firing bombs"); }
}
