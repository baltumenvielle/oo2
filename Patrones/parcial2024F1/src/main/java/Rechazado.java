public class Rechazado implements Estado {
    @Override
    public void pagarCuota(Prestamo prestamo, double monto) { throw new Error ("No se puede pagar la cuota porque el préstamo está rechazado."); }
    @Override
    public double gastosDeCancelacion(Prestamo prestamo) { throw new Error ("No se puede cancelar un préstamo rechazado."); }
}
