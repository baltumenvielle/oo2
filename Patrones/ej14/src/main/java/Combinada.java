import java.util.ArrayList;
import java.util.List;

public class Combinada extends Bien {
    private List<Bien> bienes;

    public Combinada() { this.bienes = new ArrayList<Bien>(); }

    protected double calcularValor() {
        return this.bienes.stream()
            .mapToDouble(Bien::calcularValor)
                .sum();
    }

    protected double calcularLiquidez() { return 0.5; }
}
