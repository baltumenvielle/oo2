import java.time.LocalDate;

public class Flexible implements Politica {
    @Override
    public double montoAReembolsar(Reserva reserva, LocalDate fecha) { if (LocalDate.now().isBefore(fecha)) return reserva.montoAPagar(); else return 0; }
}
