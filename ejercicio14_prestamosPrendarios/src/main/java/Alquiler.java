import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Bien {
    private LocalDate comienzoContrato, finContrato;
    private double costoMensual;

    public Alquiler(LocalDate finContrato, double costoMensual) {
        this.finContrato = finContrato;
        this.costoMensual = costoMensual;
    }

    public LocalDate getFinContrato() { return this.finContrato; }
    public double getCostoMensual() { return this.costoMensual; }

    @Override
    public double calcularLiquidez() { return 0.9; }

    @Override
    public double calcularValor() {
        long mesesRestantes = ChronoUnit.MONTHS.between(LocalDate.now(), this.getFinContrato());
        return mesesRestantes * this.getCostoMensual();
    }

    @Override
    public void agregarBien(Bien bien) {}
}
