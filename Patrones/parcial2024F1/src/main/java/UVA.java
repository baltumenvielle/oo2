public class UVA extends Prestamo {
    public UVA(double monto, int cuotas) { super(monto, cuotas); }

    public double getTasaInteres() { return Indec.getIndiceInflacion(); }
    public double getGastosSellado() { return 0; }
}
