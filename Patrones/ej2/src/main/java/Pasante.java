public class Pasante extends Empleado {
    private int examenes;

    public int getExamenes() { return this.examenes; }

    @Override
    protected double basico() { return 20000; }
    @Override
    protected double adicional() { return 2000 * this.getExamenes(); }
}
