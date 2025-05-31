import java.util.LinkedList;
import java.util.List;

public class Computadora {
    private List<Componente> componentes;

    public Computadora() { this.componentes = new LinkedList<>(); }

    public void setComponente(Componente componente) { this.componentes.add(componente); }

    public double calcularPrecio() {
        return this.componentes.stream()
                                .mapToDouble(Componente::getPrecio)
                                .sum() * 1.21;
    }

    public double getConsumo() {
        return this.componentes.stream()
                                .mapToDouble(Componente::getConsumo)
                                .sum();
    }
}
