import java.time.LocalDate;

public interface Politica {
    double montoAReembolsar(Reserva reserva, LocalDate fecha);
}
