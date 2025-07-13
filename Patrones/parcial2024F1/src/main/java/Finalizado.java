public class Finalizado implements Estado {
    @Override
    public void pagarCuota(Prestamo prestamo, double monto) { throw new Error ("La cuota no puede ser pagada porque se finalizó el pago de cuotas"); }
    @Override
    public double gastosDeCancelacion(Prestamo prestamo) { return 0; }
}
