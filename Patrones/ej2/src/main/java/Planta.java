public class Planta extends Empleado {
    private int antiguedad, hijos;
    private boolean casado;

    public int getAntiguedad() { return this.antiguedad; }
    public int getHijos() { return this.hijos; }
    public boolean isCasado() { return this.casado; }

    @Override
    protected double basico() {return 50000; }

    @Override
    protected double adicional() {
        double adicional = 2000 * this.getHijos() + 2000 * this.getAntiguedad();
        if (this.isCasado()) adicional += 5000;
        return adicional;
    }
}
