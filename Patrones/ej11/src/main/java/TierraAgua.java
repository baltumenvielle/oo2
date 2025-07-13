public class TierraAgua implements Topografia {
    private double proporcionAgua;

    @Override
    public double calcularProporcion() { return this.proporcionAgua; }
    @Override
    public boolean esIgual(Topografia topografia) { return this.proporcionAgua == topografia.calcularProporcion(); }
    @Override
    public boolean esIgualMixta(Topografia topografia) { return false; }
}
