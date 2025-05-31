import java.util.ArrayList;
import java.util.List;

public class Combinado extends Bien {
    private List<Bien> bienes;

    public Combinado() {
        this.bienes = new ArrayList<Bien>();
    }

    public void agregarBien(Bien bien) { this.bienes.add(bien); }

    @Override
    public double calcularLiquidez() { return 0.5; }

    @Override
    public double calcularValor() {
        return this.bienes.stream()
                .mapToDouble(Bien::calcularValor)
                .sum();
    }
}
