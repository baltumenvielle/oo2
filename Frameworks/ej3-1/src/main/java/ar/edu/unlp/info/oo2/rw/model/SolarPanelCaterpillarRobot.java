package ar.edu.unlp.info.oo2.rw.model;

public abstract class SolarPanelCaterpillarRobot extends SolarPanelRobot {
    public SolarPanelCaterpillarRobot(String name) { super(name); }
    public void move() { System.out.println("Robot " + this.getName() + " moving on caterpillar"); }

    public abstract void fireArms();
}
