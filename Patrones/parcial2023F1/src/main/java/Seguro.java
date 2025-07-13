public interface Seguro {
    double seguroDeVida(Cliente cliente, Vehiculo vehiculo);
    double coberturaDanos(Cliente cliente, Vehiculo vehiculo);
    double coberturaDestruccion(Vehiculo vehiculo);
}
