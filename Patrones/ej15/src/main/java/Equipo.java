import java.util.List;

public class Equipo {
    private List<Componente> componentes;

    public double calcularConsumo() { return this.componentes.stream().mapToDouble(componente -> componente.getConsumo()).sum(); }
    public double calcularPrecio() { return this.componentes.stream().mapToDouble(componente -> componente.getPrecio()).sum(); }
    public void setComponente(Componente componente) { this.componentes.add(componente); }
}
