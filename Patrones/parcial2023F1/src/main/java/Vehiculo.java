import java.time.LocalDate;

public class Vehiculo {
    private String marca;
    private double valor;
    private int capacidad, modelo;
    private Seguro seguro;

    public double getValor() { return this.valor; }
    public int getCapacidad() { return this.capacidad; }
    public int getAntiguedad() { return this.modelo - LocalDate.now().getYear(); }

    public double calcularSeguro(Cliente cliente) {
        return this.seguro.seguroDeVida(cliente, this) + this.seguro.coberturaDanos(cliente, this) + this.seguro.coberturaDestruccion(this);
    }
}
