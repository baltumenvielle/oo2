import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements Politica {

    @Override
    public double montoAReembolsar(LocalDate fechaCancelacion, double montoAPagar) {
        long diasDeAnticipacion = ChronoUnit.DAYS.between(LocalDate.now(), fechaCancelacion);

        if (diasDeAnticipacion >= 7) { return montoAPagar; }
        else if (diasDeAnticipacion >= 2) { return montoAPagar * 0.5; }
        else return 0;
    }
}
