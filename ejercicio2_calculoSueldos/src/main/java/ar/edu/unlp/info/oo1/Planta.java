package ar.edu.unlp.info.oo1;

public class Planta extends Empleado {
    private int cantidadHijos;
    private boolean casado;
    private int antiguedad;

    public Planta(String nombre, int cantidadHijos, boolean casado, int antiguedad) {
        super(nombre);
        this.cantidadHijos = cantidadHijos;
        this.casado = casado;
        this.antiguedad = antiguedad;
    }

    @Override
    public double sueldoBasico() { return 50000; }
    @Override
    public double sueldoAdicional() {
        double temp = 0;
        if (casado) temp = 5000;
        return temp + cantidadHijos * 2000 + antiguedad * 2000;
    }
}
