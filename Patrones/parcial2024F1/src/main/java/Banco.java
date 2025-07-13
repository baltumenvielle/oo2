public class Banco {
    private double tasaInteres;

    public Banco(double tasaInteres) { this.tasaInteres = tasaInteres; }

    public Simple solicitarPrestamoSimple(double monto, int cuotas, Cliente cliente) {
        Simple simple = new Simple(monto, cuotas, this.tasaInteres);
        this.aceptarORechazar(simple, cliente);
        return simple;
    }

    public UVA solicitarPrestamoUVA(double monto, int cuotas, Cliente cliente) {
        UVA uva = new UVA(monto, cuotas);
        this.aceptarORechazar(uva, cliente);
        return uva;
    }

    private void aceptarORechazar(Prestamo prestamo, Cliente cliente) {
        if (prestamo.getValorCuota() >= cliente.getSalario() * 0.3) prestamo.setEstado(new Rechazado()); else prestamo.setEstado(new Aceptado());
    }
}
