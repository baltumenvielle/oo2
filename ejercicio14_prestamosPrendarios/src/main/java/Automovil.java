import java.time.LocalDate;

public class Automovil extends Bien {
    private int modelo;
    private double kilometraje, costo0KM;

    public Automovil(double costo0KM, int modelo) {
        this.costo0KM = costo0KM;
        this.modelo = modelo;
    }

    public double getCosto0KM() { return this.costo0KM; }
    public int getModelo() { return this.modelo; }

    @Override
    public double calcularLiquidez() { return .7; }

    @Override
    public double calcularValor() { return this.getCosto0KM() - (LocalDate.now().getYear() - this.getModelo()) * (this.getCosto0KM() * 0.1); }

    @Override
    public void agregarBien(Bien bien) {}
}
