import java.time.LocalDate;

public interface Politica {
    double montoAReembolsar(LocalDate fechaCancelacion, double montoAPagar);
}
