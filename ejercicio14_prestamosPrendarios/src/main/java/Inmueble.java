public class Inmueble extends Bien {
    private String direccion;
    private double superficie, costoM2;

    public double getSuperficie() { return this.superficie; }
    public double getCostoM2() { return this.costoM2; }

    @Override
    public double calcularLiquidez() { return 0.2; }

    @Override
    public double calcularValor() { return this.getSuperficie() * this.getCostoM2(); }

    @Override
    public void agregarBien(Bien bien) {}
}
