import java.util.List;

public class Mixta implements Topografia {
    private List<Topografia> topografias;

    @Override
    public double calcularProporcion() { return this.topografias.stream()
            .mapToDouble(Topografia::calcularProporcion)
            .sum() / 4;
    }
    @Override
    public boolean esIgual(Topografia topografia) { return topografia.esIgualMixta(this); }

    @Override
    public boolean esIgualMixta(Topografia topografia) {
        return false;
    }

    @Override
    public boolean esIgualMixta(Mixta topografia) { return this.topografias.equals(topografia.topografias); }
}
