public class Aceptado implements Estado {
    @Override
    public void pagarCuota(Prestamo prestamo, double monto) {
        if (monto == prestamo.getValorCuota()) {
            prestamo.aumentarMontoPagado(monto);
            prestamo.disminuirCuotasAPagar();
            if (prestamo.getCuotasAPagar() == 0) prestamo.setEstado(new Finalizado());
        }
    }

    @Override
    public double gastosDeCancelacion(Prestamo prestamo) { return prestamo.getMontoRestante() + prestamo.getGastosAdministrativos() + prestamo.getGastosSellado(); }
}
