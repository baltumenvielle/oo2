import java.util.List;

public class Topografia implements TopografiaI {
    private List<TopografiaI> topografias;

    @Override
    public double calcularProporcionAgua() {
        return this.topografias.stream()
                                .mapToDouble(topografia -> topografia.calcularProporcionAgua())
                                .sum() / 4;
    }

    @Override
    public boolean esIgual(TopografiaI topografia) {
        return ((TopografiaI)topografia).esIgual(this);
    }

    public void agregarTopografia(TopografiaI topografia) { this.topografias.add(topografia); }
}
