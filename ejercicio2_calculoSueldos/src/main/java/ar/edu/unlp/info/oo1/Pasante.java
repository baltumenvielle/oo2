package ar.edu.unlp.info.oo1;

public class Pasante extends Empleado {
    private int examenesRendidos;

    public Pasante(String nombre, int examenesRendidos) {
        super(nombre);
        this.examenesRendidos = examenesRendidos;
    }

    @Override
    public double sueldoBasico() { return 20000; }
    @Override
    public double sueldoAdicional() { return examenesRendidos * 2000; }
}
