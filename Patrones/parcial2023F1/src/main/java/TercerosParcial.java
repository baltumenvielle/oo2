public class TercerosParcial implements Seguro {
    @Override
    public double seguroDeVida(Cliente cliente, Vehiculo vehiculo) { return 100 * cliente.getEdad(); }
    @Override
    public double coberturaDanos(Cliente cliente, Vehiculo vehiculo) { return 1000 + 0.1 * vehiculo.getValor(); }
    @Override
    public double coberturaDestruccion(Vehiculo vehiculo) { return 0.05 * vehiculo.getValor(); }
}
