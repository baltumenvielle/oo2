import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Bien {
    private LocalDate comienzoContrato, finContrato;
    private double costoMensual;

    protected double calcularValor() {
        long meses = ChronoUnit.MONTHS.between(LocalDate.now(), finContrato);
        return meses * this.costoMensual;
    }

    protected double calcularLiquidez() { return 0.9; }
}
