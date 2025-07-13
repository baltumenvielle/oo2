public class Temporario extends Empleado {
    private int horasTrabajadas, hijos;
    private boolean casado;

    public int getHorasTrabajadas() { return this.horasTrabajadas; }
    public int getHijos() { return this.hijos; }
    public boolean isCasado() { return this.casado; }

    @Override
    protected double basico() { return 20000 + this.getHorasTrabajadas() * 300; }

    @Override
    protected double adicional() {
        double adicional = this.getHijos() * 2000;
        if (this.isCasado()) adicional += 5000;
        return adicional;
    }
}
