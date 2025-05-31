import java.time.LocalDate;

public class Flexible implements Politica {

    @Override
    public double montoAReembolsar(LocalDate fechaCancelacion, double montoAPagar) {
        return montoAPagar;
    }
}
