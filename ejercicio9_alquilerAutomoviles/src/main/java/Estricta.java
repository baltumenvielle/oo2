import java.time.LocalDate;

public class Estricta implements Politica {

    @Override
    public double montoAReembolsar(LocalDate fechaCancelacion, double montoAPagar) { return 0; }
}
