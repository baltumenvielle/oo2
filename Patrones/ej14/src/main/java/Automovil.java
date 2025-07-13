import java.time.LocalDate;

public class Automovil extends Bien {
    private int modelo;
    private double kilometraje, costo0KM;

    protected double calcularValor() { return this.costo0KM - (LocalDate.now().getYear() - this.modelo) * costo0KM * 0.1; }
    protected double calcularLiquidez() { return 0.7; }
}
