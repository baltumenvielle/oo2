import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements Politica {
    @Override
    public double montoAReembolsar(Reserva reserva, LocalDate fecha) {
        long dias = ChronoUnit.DAYS.between(fecha, LocalDate.now());
        if (dias > 7) return reserva.montoAPagar();
        if (dias > 2) return reserva.montoAPagar() * 0.5;
        else return 0;
    }
}
