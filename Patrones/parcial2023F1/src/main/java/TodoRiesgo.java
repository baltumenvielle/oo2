public class TodoRiesgo implements Seguro {
    @Override
    public double seguroDeVida(Cliente cliente, Vehiculo vehiculo) { return 100 * cliente.getEdad() +  }
}
