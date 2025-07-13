public abstract class Prestamo {
    private double monto, montoPagado;
    private int cuotas, cuotasAPagar;
    private Estado estado;

    public Prestamo(double monto, int cuotas) {
        this.monto = monto;
        this.cuotas = cuotas;
        this.cuotasAPagar = this.cuotas;
        this.montoPagado = 0;
    }

    public void setEstado(Estado estado) { this.estado = estado; }
    public Estado getEstado() { return this.estado; }

    public double getValorCuota() { return this.monto / this.cuotas * this.getTasaInteres(); }
    public void pagarCuota(double monto) { this.estado.pagarCuota(this, monto); }
    public void disminuirCuotasAPagar() { this.cuotasAPagar--; }
    public int getCuotasAPagar() { return this.cuotasAPagar; }
    public double getMontoPagado() { return this.montoPagado; }
    public double getMontoRestante() { return this.getValorCuota() * this.cuotasAPagar; }
    public void aumentarMontoPagado(double monto) { this.montoPagado += monto; }
    public double getGastosCancelacion() { return this.estado.gastosDeCancelacion(this); }
    public double getGastosAdministrativos() { return this.getMontoRestante() * 0.1; }

    public abstract double getTasaInteres();
    public abstract double getGastosSellado();
}
