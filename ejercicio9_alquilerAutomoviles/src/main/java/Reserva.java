import java.time.LocalDate;

public class Reserva {
    private int cantidadDias;
    private LocalDate fecha;
    private Usuario conductor;
    private AutoEnAlquiler auto;
    private Politica politica;

    public Reserva(int cantidadDias, LocalDate fecha, AutoEnAlquiler auto) {
        this.cantidadDias = cantidadDias;
        this.fecha = fecha;
        this.auto = auto;
    }

    public double montoAPagar() { return this.cantidadDias * auto.getPrecioPorDia(); }
    public void establecerPolitica(Politica politica) { this.politica = politica; }
    public double montoAReembolsar(LocalDate fechaCancelacion) { return this.politica.montoAReembolsar(fechaCancelacion, this.montoAPagar()); }
}
