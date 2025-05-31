package ar.edu.unlp.info.oo1;

public class Temporario extends Empleado {
    private int horasTrabajadas;
    private int cantidadHijos;
    private boolean casado;

    public Temporario(String nombre, int horasTrabajadas, int cantidadHijos, boolean casado) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.cantidadHijos = cantidadHijos;
        this.casado = casado;
    }

    @Override
    public double sueldoBasico() { return 20000 + this.horasTrabajadas * 300; }
    @Override
    public double sueldoAdicional() { if (casado) return 2000 * cantidadHijos + 5000; else return 2000 * cantidadHijos; }
}
