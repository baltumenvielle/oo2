public interface Estado {
    void pagarCuota(Prestamo prestamo, double monto);
    double gastosDeCancelacion(Prestamo prestamo);
}
