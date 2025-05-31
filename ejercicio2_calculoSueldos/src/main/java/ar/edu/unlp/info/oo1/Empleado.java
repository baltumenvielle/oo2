package ar.edu.unlp.info.oo1;

public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public double sueldo() { return this.sueldoBasico() + this.sueldoAdicional() - this.descuento(); }
    public double descuento() { return this.sueldoBasico() * 0.13 + this.sueldoAdicional() * 0.05; }
    public abstract double sueldoBasico();
    public abstract double sueldoAdicional();
}