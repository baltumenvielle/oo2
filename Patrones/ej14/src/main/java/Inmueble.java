public class Inmueble extends Bien {
    private String direccion;
    private double superficie, costoM2;

    protected double calcularValor() { return this.superficie * this.costoM2; }
    protected double calcularLiquidez() { return 0.2; }
}
