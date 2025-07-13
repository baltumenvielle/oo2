public class Simple extends Prestamo {
    private double tasaInteres;

    public Simple(double monto, int cuotas, double tasaInteres) {
        super(monto, cuotas);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() { return this.tasaInteres; }
    public double getGastosSellado() { return 5000; }
}
