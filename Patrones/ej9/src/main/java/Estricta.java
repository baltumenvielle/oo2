import java.time.LocalDate;

public class Estricta implements Politica {
    @Override
    public double montoAReembolsar(Reserva reserva, LocalDate fecha) { return 0; }
}
