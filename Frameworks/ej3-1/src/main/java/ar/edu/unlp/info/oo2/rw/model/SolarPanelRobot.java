package ar.edu.unlp.info.oo2.rw.model;

public abstract class SolarPanelRobot extends Robot {
    public SolarPanelRobot(String name) { super(name); }
    public void consumeBattery() { System.out.println("Robot " + this.getName() + " using solar panel energy"); }

    public abstract void move();
    public abstract void fireArms();
}
