import java.time.LocalDate;

public class TercerosCompleto implements Seguro {
    @Override
    public double seguroDeVida(Cliente cliente, Vehiculo vehiculo) { return 100 * cliente.getEdad() + 5000 * vehiculo.getCapacidad(); }

    @Override
    public double coberturaDanos(Cliente cliente, Vehiculo vehiculo) {
        if (vehiculo.getAntiguedad() > 4) return 4000 * vehiculo.getAntiguedad();
        return 10000 * vehiculo.getAntiguedad();
    }

    @Override
    public double coberturaDestruccion(Vehiculo vehiculo) { return 0.05 * vehiculo.getValor() + 10000; }
}
