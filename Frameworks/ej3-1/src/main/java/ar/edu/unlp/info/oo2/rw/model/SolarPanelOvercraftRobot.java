package ar.edu.unlp.info.oo2.rw.model;

public abstract class SolarPanelOvercraftRobot extends SolarPanelRobot {
    public SolarPanelOvercraftRobot(String name) { super(name); }
    public void move() { System.out.println("Robot " + this.getName() + " moving on overcraft"); }

    public abstract void fireArms();
}
