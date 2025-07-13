import java.time.LocalDate;

public class Reserva {
    private Usuario conductor;
    private AutoEnAlquiler autoEnAlquiler;
    private Politica politica;
    private int cantidadDias;
    private LocalDate fecha;

    public Reserva(Usuario conductor, AutoEnAlquiler autoEnAlquiler, Politica politica, int cantidadDias) {
        this.conductor = conductor;
        this.autoEnAlquiler = autoEnAlquiler;
        this.politica = politica;
        this.cantidadDias = cantidadDias;
        this.fecha = LocalDate.now();
    }

    public int getCantidadDias() { return this.cantidadDias;}

    public double montoAPagar() { return this.autoEnAlquiler.getPrecioPorDia() * this.getCantidadDias(); }
    public double montoAReembolsar(LocalDate fecha) { return this.politica.montoAReembolsar(this, fecha); }
}
